/* 
Desafio Prático Lanchonete Sara

- Crie um sistema de geração de comanda para lanchoente
- Inicie criando variáveis para o controle de preço e quantidade de produtos
- Exibir: a QUANTIDADE e PREÇO dos produtos, SOMA, TAXA e o TOTAL.
- Use os valores: 3 COXINHA e 2 CERVEJAS
- Preço coxinha: R$ 5.00
- Preço cerveja: R$ 15.00
 */

 fun main() {

    // Variáveis de quantidade dos produtos
    val quantidadeCoxinha = 3
    val quantidadeCerveja = 2

    // Variáveis de preço dos produtos
    val precoCoxinha = 5.00
    val precoCerveja = 15.00

    var somaCoxinha = precoCoxinha * quantidadeCoxinha
    var somaCerveja = precoCerveja * quantidadeCerveja

    var totalProdutos = somaCerveja + somaCoxinha

    var taxaProdutos = totalProdutos * 0.10

    var totalProdutoComTaxa = totalProdutos + taxaProdutos

    println("-------------------------------------")
    println("              'Console'              ")
    println("-------------------------------------")
    println(".:       Lanchonete  Sara          :.")
    println("-------------------------------------")
    println("$quantidadeCoxinha coxinhas                    R$ $somaCoxinha")
    println("$quantidadeCerveja cervejas                    R$ $somaCoxinha")
    println("Somatório                     R$ $totalProdutos")
    println("Taxa 10%                      R$ $taxaProdutos")
    println("-------------------------------------")
    println("Total                         R$ $totalProdutoComTaxa")
    
 }