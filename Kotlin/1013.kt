import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val line1 = input.nextLine().split(" ");
    val res = Array(line1.size){ line1[it].toInt() }
    res.sortDescending();
    println("${res.get(0)} eh o maior");   
}

    