Algoritmo "Switch"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor    : Antonio Carlos Nicolodi
// Descrição    : Programa que executa uma das três opções:
//                1 - Verifica se um número é par ou ímpar
//                2 - Calcula as raízes de uma equação do 2º grau (Bhaskara)
//                3 - Conta de 5 em 5 até 50
// Autor(a)     : Guilherme
// Data atual   : 15/04/2025

Var
    operador, numero : inteiro
    delta, a, b, c, x1, x2 : real
    i : inteiro

Inicio
    escreval("Escolha entre as opcoes")
    escreval("1 - Par ou Ímpar")
    escreval("2 - Bhaskara")
    escreval("3 - Contador até 50 de 5 em 5")
    leia(operador)

    escolha operador
        caso 1
            escreval("Digite um número inteiro:")
            leia(numero)
            se (numero % 2 = 0) entao
                escreval("O número é par.")
            senao
                escreval("O número é ímpar.")
            fimse

        caso 2
            escreval("Digite o valor de a:")
            leia(a)
            escreval("Digite o valor de b:")
            leia(b)
            escreval("Digite o valor de c:")
            leia(c)

            delta <- (b * b) - (4 * a * c)

            se (delta < 0) entao
                escreval("Não existem raízes reais.")
            senao
                x1 <- (-b + raizq(delta)) / (2 * a)
                x2 <- (-b - raizq(delta)) / (2 * a)
                escreval("As raízes são: ", x1, " e ", x2)
            fimse
            
        caso 3
            i <- 0
            enquanto (i <= 50) faca
                escreval(i)
                i <- i + 5
            fimenquanto

        outrocaso
            escreval("Opção inválida.")
    fimescolha

Fimalgoritmo
