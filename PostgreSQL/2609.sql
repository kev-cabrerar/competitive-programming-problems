select c.name,
    sum(p.amount)
from products p,
    categories c
where p.id_categories = c.id
group by c.name