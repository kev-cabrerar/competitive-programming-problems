<?php
$salario = readline();

if ($salario >= 0 && $salario <= 2000) {
    print("Isento\n");
}
elseif ($salario > 2000 && $salario <= 3000) {
    printf("R$ %.2f\n", (($salario - 2000.0) * 0.08));
}
elseif ($salario > 3000 && $salario <= 4500) {
    printf("R$ %.2f\n", (((($salario - 2000.0) - ($salario - 3000.0))
        * 0.08) + ($salario - 3000.0) * 0.18));
}
elseif ($salario > 4500) {
    printf("R$ %.2f\n", (((($salario - 2000.0) - ($salario - 3000.0))
        * 0.08) + ((($salario - 3000.0) - ($salario - 4500.0)) * 0.18) + (($salario - 4500.0) * 0.28)));
}

?>