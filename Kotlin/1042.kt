import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val lista = arrayOf( input.nextInt(), input.nextInt(), input.nextInt());
    val lista_sort = lista.sorted();
    println(lista_sort[0]);
    println(lista_sort[1]);
    println(lista_sort[2]);
    println();
    println(lista[0]);
    println(lista[1]);
    println(lista[2]);
}