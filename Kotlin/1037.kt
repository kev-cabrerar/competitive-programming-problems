import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    var num = input.nextDouble();

    if (num >= 0 && num <= 25.0) {
    println("Intervalo [0,25]");
    } else if (num > 25.0 && num <= 50.0) {
    println("Intervalo (25,50]");
    } else if (num > 50.0 && num <= 75.0) {
    println("Intervalo (50,75]");
    } else if (num > 75.0 && num <= 100.0) {
    println("Intervalo (75,100]");
    } else {
    println("Fora de intervalo");
    }
    
}