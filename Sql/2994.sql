select d.name,
    ROUND(sum(att.hours * 150 *(1 +(0.010 * ws.bonus))), 1) salary
from doctors d,
    work_shifts ws,
    attendances att
where d.id = att.id_doctor
    and att.id_work_shift = ws.id
GROUP by d.name
order by salary desc