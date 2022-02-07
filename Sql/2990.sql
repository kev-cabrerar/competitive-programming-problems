SELECT e.cpf cpf,
    e.enome enome,
    d.dnome dnome
FROM empregados e
    LEFT join departamentos as d on e.dnumero = d.dnumero
    left join projetos as p on d.dnumero = p.dnumero
    left join trabalha as t on e.cpf = t.cpf_emp
where t.cpf_emp is NULL
order by e.cpf