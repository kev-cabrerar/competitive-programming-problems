import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val num = input.nextDouble();
    var porcentaje = 0.0;

    if (num >= 0 && num <= 400) {
        porcentaje = 0.15;
    }
    if (num > 400 && num <= 800) {
        porcentaje = 0.12;
    }
    if (num > 800 && num <= 1200) {
        porcentaje = 0.10;
    }
    if (num > 1200 && num <= 2000) {
        porcentaje = 0.07;
    }
    if (num > 2000) {
        porcentaje = 0.04;
    }
    val salario = num * (porcentaje + 1);
    println("Novo salario: %.2f".format(salario));
    println("Reajuste ganho: %.2f".format(salario - num));
    println("Em percentual: %.0f %%".format(porcentaje * 100));
    
}
    



