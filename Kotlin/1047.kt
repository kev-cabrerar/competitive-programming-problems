import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val t_minutos_inicio = input.nextInt() * 60 + input.nextInt() ;
    val t_minutos_fin = input.nextInt() * 60 + input.nextInt() ;
    val t = if(t_minutos_fin > t_minutos_inicio) t_minutos_fin - t_minutos_inicio 
    else 1440 - t_minutos_inicio + t_minutos_fin;
    val h = t / 60;
    val m = t % 60;
   
    println("O JOGO DUROU $h HORA(S) E $m MINUTO(S)");
}
    



