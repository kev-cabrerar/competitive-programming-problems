import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    input.next();
    val res = input.nextDouble() * input.nextDouble()
    input.next();
    val res2 = res + input.nextDouble() * input.nextDouble()
    println("VALOR A PAGAR: R$ %.2f".format(res2));
}