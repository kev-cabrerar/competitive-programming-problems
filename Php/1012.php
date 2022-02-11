<?php
$pi = 3.14159;
$line1 = explode(" ", readline());
$a = $line1[0];
$b = $line1[1];
$c = $line1[2];
printf("TRIANGULO: %.3f\n", (($a * $c) / 2));
printf("CIRCULO: %.3f\n", ($pi * $c * $c));
printf("TRAPEZIO: %.3f\n", (($a + $b) * $c / 2));
printf("QUADRADO: %.3f\n", ($b * $b));
printf("RETANGULO: %.3f\n", ($a * $b));
?>