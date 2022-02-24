import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val animal1 = input.nextLine();
    val animal2 = input.nextLine();
    val animal3 = input.nextLine();

    if (animal1 == "vertebrado") {
        if (animal2 == "ave") {
            if (animal3 == "carnivoro") {
                println("aguia")
            } else {
                println("pomba")
            }
        } else {
            if (animal3 == "onivoro") {
                println("homem")
            } else {
                println("vaca")
            }
        }
    } else {
        if (animal2 == "inseto") {
            if (animal3 == "hematofago") {
                println("pulga")
            } else {
                println("lagarta")
            }
        } else {
            if (animal3 == "hematofago") {
                println("sanguessuga")
            } else {
                println("minhoca")
            }
        }
    }
    
}
    



