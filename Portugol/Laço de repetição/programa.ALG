Algoritmo "Switch"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor    : Antonio Carlos Nicolodi
// Descri��o    : Programa que executa uma das tr�s op��es:
//                1 - Verifica se um n�mero � par ou �mpar
//                2 - Calcula as ra�zes de uma equa��o do 2� grau (Bhaskara)
//                3 - Conta de 5 em 5 at� 50
// Autor(a)     : Guilherme
// Data atual   : 15/04/2025

Var
    operador, numero : inteiro
    delta, a, b, c, x1, x2 : real
    i : inteiro

Inicio
    escreval("Escolha entre as opcoes")
    escreval("1 - Par ou �mpar")
    escreval("2 - Bhaskara")
    escreval("3 - Contador at� 50 de 5 em 5")
    leia(operador)

    escolha operador
        caso 1
            escreval("Digite um n�mero inteiro:")
            leia(numero)
            se (numero % 2 = 0) entao
                escreval("O n�mero � par.")
            senao
                escreval("O n�mero � �mpar.")
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
                escreval("N�o existem ra�zes reais.")
            senao
                x1 <- (-b + raizq(delta)) / (2 * a)
                x2 <- (-b - raizq(delta)) / (2 * a)
                escreval("As ra�zes s�o: ", x1, " e ", x2)
            fimse
            
        caso 3
            i <- 0
            enquanto (i <= 50) faca
                escreval(i)
                i <- i + 5
            fimenquanto

        outrocaso
            escreval("Op��o inv�lida.")
    fimescolha

Fimalgoritmo
