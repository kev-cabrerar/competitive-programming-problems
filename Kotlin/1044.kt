import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val a = input.nextInt();
    val b = input.nextInt();
    input.close();
    println(if (b % a == 0 || a % b == 0) "Sao Multiplos" else "Nao sao Multiplos");
    
}