select m.id,
    m.name
from movies m,
    genres g,
    actors a,
    movies_actors ma
where m.id_genres = g.id
    and g.description = 'Action'
    and a.id = ma.id_actors
    and ma.id_movies = m.id
    and a.name in ('Miguel Silva', 'Marcelo Silva')
group by m.id