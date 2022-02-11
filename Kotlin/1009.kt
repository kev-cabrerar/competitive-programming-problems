import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    input.next();
    val res = input.nextDouble() + input.nextDouble()*0.15
    println("TOTAL = R$ %.2f".format(res));
}