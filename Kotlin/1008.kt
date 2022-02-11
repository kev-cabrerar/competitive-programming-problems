import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val num = input.nextInt();
    val res = input.nextInt() * input.nextDouble()
    println("NUMBER = " + num);
    println("SALARY = U$ %.2f".format(res));
}