import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val res = input.nextInt() * input.nextInt() - input.nextInt() * input.nextInt();
    println("DIFERENCA = "+res);
}