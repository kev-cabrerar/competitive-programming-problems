SELECT p.name,
    pv.name
from products p,
    providers pv
where p.id_providers = pv.id
    and pv.name = 'Ajax SA'