SELECT sender.year,
    users.name,
    (
        SELECT users.name
        from users
        where sender.receiver = users.id
    )
from (
        SELECT max(packages.year) "year",
            packages.id_user_sender,
            max(packages.id_user_receiver) receiver
        from packages
        GROUP by packages.id_user_sender
    ) sender
    JOIN users on sender.id_user_sender = users.id
    and not users.address = 'Taiwan'
ORDER by (sender.year, users.id) desc