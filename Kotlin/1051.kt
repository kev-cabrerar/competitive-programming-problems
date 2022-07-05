import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val salario = input.nextDouble();

    if (salario >= 0 && salario <= 2000) {
        println("Isento");
    }
    else if (salario > 2000 && salario <= 3000) {
        println("R$ %.2f".format((salario - 2000.0) * 0.08));
    }
    else if (salario > 3000 && salario <= 4500) {
        println("R$ %.2f".format((((salario - 2000.0) - (salario - 3000.0))
            * 0.08) + (salario - 3000.0) * 0.18));
    }
    else if (salario > 4500) {
        println("R$ %.2f".format((((salario - 2000.0) - (salario - 3000.0))
            * 0.08) + (((salario - 3000.0) - (salario - 4500.0)) * 0.18) + ((salario - 4500.0) * 0.28)));
    }
}