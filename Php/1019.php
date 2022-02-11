<?php
$t = readline();
$hora = floor($t / 3600);
$min = floor(($t % 3600) / 60);
$seg = $t % 60;
print($hora . ":" . $min . ":" . $seg . "\n");
?>