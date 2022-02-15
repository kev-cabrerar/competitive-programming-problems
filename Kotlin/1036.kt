import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val a = input.nextDouble();
    val b = input.nextDouble();
    val c = input.nextDouble();

    if ((b * b - 4 * a * c) < 0 || 2 * a == 0.0){
        println("Impossivel calcular")
    }else{
        println("R1 = %.5f".format((-b + Math.sqrt(b * b - 4.0 * a * c)) / (2 * a)));
        println("R2 = %.5f".format((-b - Math.sqrt(b * b - 4.0 * a * c)) / (2 * a)));
    }
    
}