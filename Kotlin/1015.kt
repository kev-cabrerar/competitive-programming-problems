import java.util.Scanner
import kotlin.math.*

fun main() {
    val input = Scanner(System.`in`);
    val line1 = input.nextLine().split(" ");
    val line2 = input.nextLine().split(" ");
    val x1 = line1[0].toDouble();
    val y1 = line1[1].toDouble();
    val x2 = line2[0].toDouble();
    val y2 = line2[1].toDouble();
    println("%.4f".format(sqrt((x2 - x1).pow(2) +  (y2 - y1).pow(2))));
}

    