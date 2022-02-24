<?php
[$h_inicio, $m_inicio, $h_fin, $m_fin] = explode(" ", readline());
$t_minutos_inicio = 60 * $h_inicio + $m_inicio;
$t_minutos_fin = 60 * $h_fin + $m_fin;

$t = $t_minutos_fin > $t_minutos_inicio ? 
$t_minutos_fin - $t_minutos_inicio : 
1440 - $t_minutos_inicio + $t_minutos_fin;

$h = intdiv($t, 60);
$m = $t % 60;

printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n" ,$h, $m)

?>


