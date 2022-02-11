<?php
$num = readline();
$billetes = [100, 50, 20, 10, 5, 2, 1];
print($num . "\n");
foreach ($billetes as $b) {
    print(floor($num / $b) . " nota(s) de R$ " . $b . ",00\n");
    $num %= $b;
}
?>