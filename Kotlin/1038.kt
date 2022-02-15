import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val line1 = input.nextLine().split(" ");
    val precios = arrayOf( 4.0, 4.50, 5.0, 2.0, 1.50);
    val product = line1[0].toInt()
    val qtd = line1[1].toInt()
    
    println("Total: R$ %.2f".format(precios[product-1]*qtd));
    
}