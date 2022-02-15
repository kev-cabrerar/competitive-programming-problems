import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    var num = input.nextDouble()+ 0.001;
    val billetes = arrayOf(100.0, 50.0, 20.0, 10.0, 5.0, 2.0);
    val monedas = arrayOf(1.00, 0.50, 0.25, 0.10, 0.05, 0.01);
    println("NOTAS:");
    for (i in billetes.indices) {
        println("${(num / billetes[i]).toInt()} nota(s) de R$ %.2f".format(billetes[i]));
        num %= billetes[i];
    }
    println("MOEDAS:");
    for (i in monedas.indices) {
        println("${(num / monedas[i]).toInt()} moeda(s) de R$ %.2f".format(monedas[i]));
        num %= monedas[i];
    }

    
}