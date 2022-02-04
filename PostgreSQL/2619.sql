select p.name,
    pv.name,
    p.price
from products p,
    providers pv,
    categories c
where p.id_providers = pv.id
    and p.id_categories = c.id
    and c.name = 'Super Luxury'
    and p.price > 1000