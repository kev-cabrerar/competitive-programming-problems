<?php
$line1 = explode(" ", readline());
$a = $line1[0];
$b = $line1[1];
$c = $line1[2];

if (($b * $b - 4 * $a * $c) < 0 || 2 * $a == 0) {
    print("Impossivel calcular" . "\n");
}
else {
    printf("R1 = %.5f\n", ((-$b + sqrt($b * $b - 4 * $a * $c)) / (2 * $a)));
    printf("R2 = %.5f\n", ((-$b - sqrt($b * $b - 4 * $a * $c)) / (2 * $a)));
}

?>

