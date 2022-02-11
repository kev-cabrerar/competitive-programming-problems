import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val pi = 3.14159;
    val r = input.nextInt();
    val res = 4.0/3.0 * pi * r * r * r;
    println("VOLUME = %.3f".format(res));
}