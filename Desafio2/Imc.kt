import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    var sair: Char

    do {
        coletarDados()
        print("Tecle [c] para continuar ou [s] para sair: ")
        sair = scanner.next()[0]
    } while (sair != 's')
}

fun coletarDados() {

    val scanner = Scanner(System.`in`)

    print("Qual é o seu peso atual? ")
    val peso = scanner.nextFloat()

    print("Qual é a sua altura? ")
    val altura = scanner.nextFloat()

    val imc = calcularIMC(peso, altura)
    println("Seu IMC é: %.2f".format(imc))


    when {
        imc < 18.5 -> println("Excesso de Magreza")
        imc < 25 -> println("Peso Normal")
        imc < 30 -> println("Excesso de Peso")
        imc < 35 -> println("Obesidade - Grau I")
        imc < 40 -> println("Obesidade - Grau II")
        else -> println("Obesidade - Grau III")
    }
}

fun calcularIMC(peso: Float, altura: Float): Float {
    return peso / (altura * altura)
}
