select p.name,c.name from products p,categories c 
where p.id_categories=c.id and p.amount > 100 and p.id_categories in (1,2,3,6,9)