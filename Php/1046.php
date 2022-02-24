<?php
[$inicio, $fin] = explode(" ", readline());

if ($inicio == $fin) {
    print("O JOGO DUROU 24 HORA(S)\n");
}
else if ($inicio > $fin) {
    print("O JOGO DUROU " . (24 - $inicio + $fin) . " HORA(S)\n");
}
else {
    print("O JOGO DUROU " . ($fin - $inicio) . " HORA(S)\n");
}
?>