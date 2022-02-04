select p.name
from providers pv,
    products p
where p.id_providers = pv.id
    and p.amount BETWEEN 10 AND 20
    and pv.name like 'P%'