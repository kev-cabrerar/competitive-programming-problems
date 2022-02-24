<?php
$animal1 = readline();
$animal2 = readline();
$animal3 = readline();

if ($animal1 == "vertebrado") {
    if ($animal2 == "ave") {
        if ($animal3 == "carnivoro") {
            print "aguia" . "\n";
        }
        else {
            print "pomba" . "\n";
        }
    }
    else {
        if ($animal3 == "onivoro") {
            print "homem" . "\n";
        }
        else {
            print "vaca" . "\n";
        }
    }
}
else {
    if ($animal2 == "inseto") {
        if ($animal3 == "hematofago") {
            print "pulga" . "\n";
        }
        else {
            print "lagarta" . "\n";
        }
    }
    else {
        if ($animal3 == "hematofago") {
            print "sanguessuga" . "\n";
        }
        else {
            print "minhoca" . "\n";
        }
    }
}


?>