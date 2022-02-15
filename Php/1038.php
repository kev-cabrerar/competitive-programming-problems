<?php
$line1 = explode(" ", readline());
$precios = [4.0, 4.50, 5.0, 2.0, 1.50];
$product = $line1[0];
$qtd = $line1[1];

printf("Total: R$ %.2f\n", ($precios[$product - 1] * $qtd));
?>




