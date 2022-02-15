<?php
$linea1 = explode(" ", readline());
$res = ($linea1[0] * 2 + $linea1[1] * 3 + $linea1[2] * 4 + $linea1[3] * 1) / 10;
printf("Media: %.1f\n", $res);
if ($res >= 7) {
    printf("Aluno aprovado.\n");
}
else if ($res >= 5 && $res <= 6.9) {
    printf("Aluno em exame.\n");
    $num5 = floatval(readline());
    $res = ($res + $num5) / 2;
    printf("Nota do exame: %.1f\n", $num5);
    if ($res >= 5) {
        printf("Aluno aprovado.\n");
    }
    else {
        printf("Aluno reprovado.\n");
    }
    printf("Media final: %.1f\n", $res);
}
else if ($res < 5) {
    printf("Aluno reprovado.\n");
}

?>
