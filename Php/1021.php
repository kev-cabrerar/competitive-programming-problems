<?php
$num = floatval(readline()) + 0.001;
$billetes = [100, 50, 20, 10, 5, 2];
$monedas = [100, 50, 25, 10, 5, 1];
$num2 = floatval("." . explode(".", $num)[1]);
print("NOTAS:\n");
foreach ($billetes as $b) {
    printf("%d nota(s) de R$ %.2f\n", $num / $b, $b);
    $num = $num % $b;
}
$num = ($num + $num2) * 100;
print("MOEDAS:\n");
foreach ($monedas as $m) {
    printf("%d moeda(s) de R$ %.2f\n", $num / $m, $m / 100);
    $num = $num % $m;
}

?>