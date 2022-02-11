import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val res = (input.nextDouble()*2 + input.nextDouble()*3 + input.nextDouble()*5) / 10;
    println("MEDIA = %.1f".format(res));
}