import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    var num = input.nextInt();
    val billetes = arrayOf(100, 50, 20, 10, 5, 2, 1);
    println(num);
    for (i in billetes.indices) {
        println("${num / billetes[i]} nota(s) de R$ ${billetes[i]},00");
        num %= billetes[i];
    }
    
}