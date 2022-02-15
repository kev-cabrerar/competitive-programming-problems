import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val num1 = input.nextFloat();
    val num2 = input.nextFloat();
    val num3 = input.nextFloat();
    val num4 = input.nextFloat();

    var res = (num1 * 2 + num2 * 3 + num3 * 4 + num4 * 1) / 10;
    println("Media: %.1f".format(res));

    if (res >= 7) {
        println("Aluno aprovado.");
    } else if (res >= 5 && res <= 6.9) {
        println("Aluno em exame.");
        val num5 = input.nextFloat();
        res = (res + num5) / 2;
        println("Nota do exame: %.1f".format(num5));
    if (res >= 5) {
        println("Aluno aprovado.");
    } else {
        println("Aluno reprovado.");
    }
    println("Media final: %.1f".format(res));
    } else if (res < 5) {
    println("Aluno reprovado.");
    }

    
}