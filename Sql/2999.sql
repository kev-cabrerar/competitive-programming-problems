SELECT salario_empleado_division.nome,
    salario_empleado_division.salario
FROM (
        SELECT departamento_division_empleado.departamento,
            departamento_division_empleado.division,
            descuento_empleado.nome,
            salario_empleado.salario - descuento_empleado.descuento "salario",
            departamento_division_empleado.codigo_division
        FROM (
                --Obtener el descuento por matricula empleado
                SELECT e.matr matricula,
                    e.nome,
                    SUM(COALESCE(d.valor, 0)) descuento
                FROM empregado as e
                    LEFT JOIN emp_desc ON e.matr = emp_desc.matr
                    LEFT JOIN desconto as d ON emp_desc.cod_desc = d.cod_desc
                GROUP BY e.matr,
                    e.nome
            ) descuento_empleado
            join (
                --Obtener el departamento y la division del empleado
                SELECT dep.cod_dep codigo_departamento,
                    dep.nome departamento,
                    div.cod_divisao codigo_division,
                    div.nome division,
                    e.matr matricula
                FROM empregado as e
                    JOIN divisao as div ON e.lotacao_div = div.cod_divisao
                    JOIN departamento as dep ON dep.cod_dep = div.cod_dep
            ) departamento_division_empleado ON departamento_division_empleado.matricula = descuento_empleado.matricula
            JOIN (
                --Obtener el salario por empleado
                SELECT e.matr matricula,
                    SUM(COALESCE(v.valor, 0)) salario
                FROM empregado as e
                    LEFT JOIN emp_venc ON e.matr = emp_venc.matr
                    LEFT JOIN vencimento as v ON v.cod_venc = emp_venc.cod_venc
                GROUP BY e.matr
            ) salario_empleado on salario_empleado.matricula = departamento_division_empleado.matricula
        GROUP by departamento_division_empleado.departamento,
            descuento_empleado.nome,
            salario_empleado.salario,
            descuento_empleado.descuento,
            departamento_division_empleado.division,
            departamento_division_empleado.codigo_division
    ) salario_empleado_division
where salario_empleado_division.salario > 8000 --error en el problema, solo valida los superiores a 8000
order by salario_empleado_division.codigo_division