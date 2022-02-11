import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val t = input.nextInt();
    val horas = t/3600;
    val min = (t%3600)/60;
    val seg = t%60;
    println("$horas:$min:$seg");
    
}