SELECT t.name,
    (
        SELECT COUNT(
                m1.team_1 = t.id
                or m1.team_2 = t.id
            )
        from matches m1
        WHERE (
                m1.team_1 = t.id
                or m1.team_2 = t.id
            )
    ) as "matches",
    (
        SELECT(
                SELECT COUNT(
                        case
                            when m1.team_1_goals > m1.team_2_goals then 1
                        end
                    )
                from matches as m1
                WHERE (m1.team_1 = t.id)
            ) +(
                SELECT COUNT(
                        case
                            when m2.team_2_goals > m2.team_1_goals then 1
                        end
                    )
                from matches as m2
                WHERE (m2.team_2 = t.id)
            )
    ) AS "victories",
    (
        SELECT(
                SELECT COUNT(
                        case
                            when m1.team_1_goals < m1.team_2_goals then 1
                        end
                    )
                from matches as m1
                WHERE (m1.team_1 = t.id)
            ) +(
                SELECT COUNT(
                        case
                            when m2.team_2_goals < m2.team_1_goals then 1
                        end
                    )
                from matches as m2
                WHERE (m2.team_2 = t.id)
            )
    ) AS "defeats",
    (
        SELECT(
                SELECT COUNT(
                        case
                            when m1.team_1_goals = m1.team_2_goals then 1
                        end
                    )
                from matches as m1
                WHERE (m1.team_1 = t.id)
            ) +(
                SELECT COUNT(
                        case
                            when m2.team_2_goals = m2.team_1_goals then 1
                        end
                    )
                from matches as m2
                WHERE (m2.team_2 = t.id)
            )
    ) AS "draws",
    (
        SELECT(
                SELECT SUM(
                        case
                            when m1.team_1_goals > m1.team_2_goals then 3
                            when m1.team_1_goals = m1.team_2_goals then 1
                            ELSE 0
                        end
                    )
                from matches as m1
                WHERE (m1.team_1 = t.id)
            ) +(
                SELECT SUM(
                        case
                            when m2.team_2_goals > m2.team_1_goals then 3
                            when m2.team_1_goals = m2.team_2_goals then 1
                            ELSE 0
                        end
                    )
                from matches as m2
                WHERE (m2.team_2 = t.id)
            )
    ) as "score"
from teams as t