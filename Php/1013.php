<?php
$line1 = explode(" ", readline());
rsort($line1, SORT_NUMERIC);
print($line1[0] . " eh o maior\n");
?>