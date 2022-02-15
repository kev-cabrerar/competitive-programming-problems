<?php
[$a, $b, $c] = explode(" ", readline());
$line1_sorted = [$a, $b, $c];
rsort($line1_sorted, SORT_NUMERIC);
[$a, $b, $c] = $line1_sorted;

if ($a >= $b + $c) {
    print("NAO FORMA TRIANGULO\n");
}
else if (pow($a, 2) == pow($b, 2) + pow($c, 2)) {
    print("TRIANGULO RETANGULO\n");
}
else if (pow($a, 2) > pow($b, 2) + pow($c, 2)) {
    print("TRIANGULO OBTUSANGULO\n");
}
else if (pow($a, 2) < pow($b, 2) + pow($c, 2)) {
    print("TRIANGULO ACUTANGULO\n");
}
if ($a == $b && $b == $c) {
    print("TRIANGULO EQUILATERO\n");
}
else if ($a == $b && $b != $c || $a != $b && $b == $c || $a == $c && $c != $b) {
    print("TRIANGULO ISOSCELES\n");
}
?>