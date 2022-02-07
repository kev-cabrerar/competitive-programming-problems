select c.name,
    o.id
from customers c,
    orders o
where o.id_customers = c.id
    and o.orders_date BETWEEN '2016-01-01' AND '2016-06-30'