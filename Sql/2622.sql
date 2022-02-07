select name
from customers
where id in(
        select l.id_customers
        from legal_person l
    )