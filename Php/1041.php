<?php
$linea1 = explode(" ", readline());
$x = $linea1[0];
$y = $linea1[1];

if ($x == 0 && $y == 0) {
    print("Origem" . "\n");
}
elseif ($x == 0 && $y != 0) {
    print("Eixo Y" . "\n");
}
elseif ($x != 0 && $y == 0) {
    print("Eixo X" . "\n");
}
elseif ($x > 0 && $y > 0) {
    print("Q1" . "\n");
}
elseif ($x < 0 && $y > 0) {
    print("Q2" . "\n");
}
elseif ($x < 0 && $y < 0) {
    print("Q3" . "\n");
}
elseif ($x > 0 && $y < 0) {
    print("Q4" . "\n");
}

?>