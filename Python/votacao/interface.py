import os
from time import sleep

candidatos = []

operador = 0

while operador != 4:
    os.system("cls")
    print('-=-=-=-=-=-=-=-=-= Votação Representante =-=-=-=-=-=-=-=-=-')
    print('1 - Cadastrar candidato')
    print('2 - Votar') 
    print('3 - Resultado votos')
    print('4 - Sair do programa\n')

    operador = int(input('Digite a operação que deseja efetuar: '))

    match operador:
        case 1:
            os.system("cls")
            print('-=-=-=-=-=-=-=-=-= Cadastro Candidato =-=-=-=-=-=-=-=-=-')
            nome = input('Digite seu nome: ')
            numero = int(input('Digite o seu número de partido: '))

            candidato = {
                "nome" : nome,
                "numero" : numero,
                "votos" : 0
            }

            candidatos.append(candidato)

            os.system("cls")
            print('-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-')
            print('Candidato cadastrado com sucesso!')
            print('-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-')
            sleep(1)

        case 2:
            os.system("cls")
            print('-=-=-=-=-=-=-=-=-= Efetuar votação =-=-=-=-=-=-=-=-=-')

            for i in candidatos:
                print(f"- {i["nome"]} {i["numero"]}")

            voto = int(input('Digite o número do canditato que você quer votar: '))

            for candidato in candidatos:
                if candidato["numero"] == voto:
                    candidato["votos"] += 1

        case 3:
            os.system("cls")
            print('-=-=-=-=-=-=-=-=-= Resultado Votos =-=-=-=-=-=-=-=-=-')

            if not candidatos:
                print('Sem candidatos cadastrados.')
            else:
                candidatos_ordenados = sorted(candidatos, key=lambda x: x['votos'], reverse=True)
                
                ordem = 1

                for candidato in candidatos_ordenados:
                    print(f"{ordem}- {candidato["nome"]} {candidato["votos"]} votos")
                    ordem += 1

        case 4:
            os.system("cls")
            print('Programa finalizado!')