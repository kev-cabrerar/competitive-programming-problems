SELECT concat(substr(n.cpf,1,3),'.',substr(n.cpf,4,3),'.',substr(n.cpf,7,3),'-',substr(n.cpf,10,2)) as CPF
FROM natural_person n