SELECT amount
from value_table
GROUP by amount
order by count(amount) desc
limit 1