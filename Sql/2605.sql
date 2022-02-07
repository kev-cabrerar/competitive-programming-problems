select p.name,
    pv.name
from providers pv,
    products p
where p.id_providers = pv.id
    and p.id_categories = 6