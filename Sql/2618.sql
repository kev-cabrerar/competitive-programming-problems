select p.name,
    pv.name,
    c.name
from products p,
    providers pv,
    categories c
where p.id_providers = pv.id
    and p.id_categories = c.id
    and pv.name = 'Sansul SA'
    and c.name = 'Imported'