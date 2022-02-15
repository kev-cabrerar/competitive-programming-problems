<?php
$num = readline();

if ($num >= 0 && $num <= 25.0) {
    print("Intervalo [0,25]" . "\n");
}
else if ($num > 25.0 && $num <= 50.0) {
    print("Intervalo (25,50]" . "\n");
}
else if ($num > 50.0 && $num <= 75.0) {
    print("Intervalo (50,75]" . "\n");
}
else if ($num > 75.0 && $num <= 100.0) {
    print("Intervalo (75,100]" . "\n");
}
else {
    print("Fora de intervalo" . "\n");
}

?>