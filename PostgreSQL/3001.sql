SELECT products.name,
    sum(
        case
            WHEN products.type = 'A' then 20.0
            WHEN products.type = 'B' then 70.0
            WHEN products.type = 'C' then 530.5
        end
    )
from products
GROUP by products.name,
    products.id
ORDER by products.type,
    products.id desc