import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val a = input.nextDouble();
    val b = input.nextDouble();
    val c = input.nextDouble();

    if(a < (b + c) && b < (c + a) && c < (a + b)){
        println("Perimetro = %.1f".format( (a + b + c)));
    }
    
    else{
        println("Area = %.1f".format((((a + b) * c) / 2)));
    }
}