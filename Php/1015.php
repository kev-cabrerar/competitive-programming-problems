<?php
$line1 = explode(" ", readline());
$line2 = explode(" ", readline());
$x1 = $line1[0];
$y1 = $line1[1];
$x2 = $line2[0];
$y2 = $line2[1];
printf("%.4f\n", sqrt(pow($x2 - $x1, 2) + pow($y2 - $y1, 2)));
?>