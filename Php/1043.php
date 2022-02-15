<?php
[$a, $b, $c] = explode(" ", readline());
if ($a < ($b + $c) && $b < ($c + $a) && $c < ($a + $b)) {
    printf("Perimetro = %.1f\n", ($a + $b + $c));
}
else {
    printf("Area = %.1f\n", (($a + $b) * $c) / 2);
}
?>