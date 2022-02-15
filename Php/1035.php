<?php
$line1 = explode(" ", readline());
$a = $line1[0];
$b = $line1[1];
$c = $line1[2];
$d = $line1[3];

if ($b > $c && $d > $a && $c + $d > $a + $b && $c > 0 && $d > 0 && $a % 2 == 0) {
    print("Valores aceitos" . "\n");
}
else {
    print("Valores nao aceitos" . "\n");
}
?>

