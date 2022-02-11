import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val edad = input.nextInt();
    val ano = edad/365;
    val mes = (edad%365)/30;
    val dia = (edad%365)%30;
    println("$ano ano(s)\n$mes mes(es)\n$dia dia(s)");
    
}