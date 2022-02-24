import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    var inicio = input.nextInt();
    var fin = input.nextInt();
    
    if(inicio == fin){
        println("O JOGO DUROU 24 HORA(S)")
    }
    else if(inicio > fin){
        println("O JOGO DUROU ${24 - inicio + fin} HORA(S)")
    }
    else if(inicio < fin){
        println("O JOGO DUROU ${fin - inicio} HORA(S)")
    }
    
}
