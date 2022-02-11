import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val pi = 3.14159;
    val a = input.nextDouble();
    val b = input.nextDouble();
    val c = input.nextDouble();
    println("TRIANGULO: %.3f".format((a * c) / 2));
    println("CIRCULO: %.3f".format(pi * c * c));
    println("TRAPEZIO: %.3f".format((a + b) * c / 2));
    println("QUADRADO: %.3f".format(b * b));
    println("RETANGULO: %.3f".format(a * b));
}