import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    var a = input.nextDouble();
    var b = input.nextDouble();
    var c = input.nextDouble();
    val list_sorted = listOf(a, b, c).sortedDescending();
    a = list_sorted[0];
    b = list_sorted[1];
    c = list_sorted[2];
    
    if (a >= b + c) {
        println("NAO FORMA TRIANGULO");
    }
    else if (Math.pow(a,2.0) == Math.pow(b, 2.0) + Math.pow(c, 2.0)) {
        println("TRIANGULO RETANGULO");
    }
    else if (Math.pow(a, 2.0) > Math.pow(b, 2.0) + Math.pow(c, 2.0)) {
        println("TRIANGULO OBTUSANGULO");
    }
    else if (Math.pow(a, 2.0) < Math.pow(b, 2.0) + Math.pow(c, 2.0)) {
        println("TRIANGULO ACUTANGULO");
    }
    if (a == b && b == c) {
        println("TRIANGULO EQUILATERO");
    }
    else if (a == b && b != c || a != b && b == c || a == c && c != b) {
        println("TRIANGULO ISOSCELES");
    }
}
