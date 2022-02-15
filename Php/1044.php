<?php
[$a, $b] = explode(" ", readline());
print($a % $b == 0 || $b % $a == 0 ? "Sao Multiplos\n" : "Nao sao Multiplos\n");
?>