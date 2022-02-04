SELECT c.name,
    r.rentals_date
FROM rentals r,
    customers c
where r.id_customers = c.id
    and r.rentals_date BETWEEN '2016-09-01' AND '2016-09-30'