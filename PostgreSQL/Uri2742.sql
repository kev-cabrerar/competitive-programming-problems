SELECT l.name,ROUND((l.omega*1.618),3) as "The N Factor"
from dimensions d,life_registry l
where d.id=l.dimensions_id and d.name in ('C875','C774') and l.name like '%Richard%'