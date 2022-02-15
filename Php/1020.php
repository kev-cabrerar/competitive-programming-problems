<?php
$edad = readline();
$ano = floor($edad / 365);
$mes = floor(($edad % 365) / 30);
$dia = floor(($edad % 365) % 30);
print($ano . " ano(s)\n" . $mes . " mes(es)\n" . $dia . " dia(s)\n");
?>
