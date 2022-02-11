import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val res = (input.nextDouble()*3.5 + input.nextDouble()*7.5) / 11;
    println("MEDIA = %.5f".format(res));
}