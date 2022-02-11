import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val r = input.nextDouble();
    println("A=%.4f".format(r*r*3.14159));
}