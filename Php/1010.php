<?php
$line1 = explode(" ", readline());
$line2 = explode(" ", readline());
$res = $line1[1] * $line1[2] + $line2[1] * $line2[2];
printf("VALOR A PAGAR: R$ %.2f\n", $res);
?>