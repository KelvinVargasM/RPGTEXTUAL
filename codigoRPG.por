programa
{
	inclua biblioteca Util --> u
	
	//Status do personagem principal
	inteiro hp = 20, ataque = 5, velocidade = 12, defesa =5,xp=0
	
	//Status dos inimigos
	
	inteiro inihp = 20, iniataque = 5, inivelocidade = 5 , inidefesa = 5

	inteiro gerar, gerarxp
	

	
		
        	
    
	funcao inicio(){
		cadeia nome
		inteiro menuclasse = 0, caminho = 0

		escreva("insira o nome do personagem\n")
		leia(nome)

		enquanto (menuclasse !=1 e  menuclasse !=2 e menuclasse !=3 e menuclasse != 4) {
            escreva("selecione a classe do personagem \n1-Guerreiro \n2-Ladrão \n3-Barbaro \n4-Druida\n")
            leia(menuclasse)
            
            escolha (menuclasse) {
                caso 1:
				escreva("Você escolheu a classe 1\n")
				ataque += 2
                    pare
                caso 2:
				escreva("Você escolheu a classe 2\n")
				velocidade +=2
                    pare

                caso 3:
				escreva("Você escolheu a classe 2\n")
				defesa +=2
                    pare

                caso 4:
				escreva("Você escolheu a classe 2\n")
				hp +=2
                    pare

                caso contrario:
				escreva("Opção invalida digite novamente\n")

                    pare

            }
        }
        escreva("Bem vindo jogador ", nome ,"\n")
        	escreva("Em uma casa no meio da floresta, você é acordado com uma sensação de inquitação\n")
		escreva("Então decide vasculhar a casa... acaba se assustando ao descobrir que o mundo ao seu redor mudou drasticamente\n")
		escreva("Vultos e sons perturbadores preenchem o ambiente...\n")
		escreva("Ao olhar pela janela, se depara com um cenário estranho e surreal, completamente diferente do que estava habituado.")
		escreva("\n")
		escreva("Então decide sair da casa, para encontrar uma maneira de sair desse pesadelo...\n")
		escreva("Depois de sair de casa e ver que tudo está diferente você está em uma floresta e tem dois caminho para onde ir\n")
		escreva("\n")
	
				
				enquanto(caminho != 1 e caminho != 2){
					escreva("Primeira ação - digite a sua escolha: 1 - direita ou 2 - esquerda?\n")
            			leia(caminho)	
            			
             escolha (caminho) {
                caso 1:
                    escreva("você encontrou aranha nivel 1\n")
                    pare
                caso 2:
                    escreva("você encontrou aranha nivel 2\n")
                    pare
                caso contrario:
                    escreva("entrada de dados invalida\n")
                    pare
				}
				
		}
	 	se (velocidade>inivelocidade) {
            luta()
        }senao{
            lutaini()
        }
	}
        funcao inteiro ataqueinimigo(){
			gerar = u.sorteia(0,1)
			retorne gerar
		}
		
		funcao inteiro gerarx(){
			gerarxp = u.sorteia(20, 40)
			retorne gerarxp
		}
		
	    funcao luta() {
        
        inteiro decisao = 0

       


        enquanto (hp > 0 e inihp > 0 e decisao != 2) {
            escreva("==================================================================\n")
            escreva("você entrou no combate selecione a opção para (1) atacar ou (2) correr\n")
            escreva("==================================================================\n")
            escreva("vida do usuario ", hp, "\n")
            escreva("vida do inimigo ", inihp,"\n")
            

            leia(decisao)

            escolha (decisao) {
                caso 1:
                    escreva("você atacou o inimigo\n")
                    inihp -= ataque / 2
                    pare

                caso 2:
                    escreva("você fugiu do combate\n")
                    pare

                caso contrario:
                    escreva("opção invalida digite a opção novamente\n")
                    pare
            }
            se (decisao != 2) {
                se (inihp > 0) {
                    decisao = ataqueinimigo()
                    escolha (decisao) {
                        caso 0:
                            escreva("O inimigo aplicou um ataque\n")
                            hp -= iniataque / 2
                            pare
                        caso 1:
                            escreva("O inimigo errou o ataque\n")
                            pare
                    }
                }
            }

        }


        se (decisao == 2) {
            escreva("você fugiu do combate\n")
        } senao se(hp <= 0) {
            escreva("você foi derrotado\n")
        } senao {
            escreva("você derrotou o inimigo\n")
            xp = gerarx()
            escreva("você ganhou ",xp," de xp")
        }
    }
        funcao lutaini() {
        	  inteiro decisao = 0, decisaoini = 0
        	  enquanto (hp > 0 e inihp > 0 e decisao != 2) {
            escreva("==================================================================\n")
            escreva("você entrou no combate selecione a opção para (1) atacar ou (2) correr\n")
            escreva("==================================================================\n")
            escreva("vida do usuario ", hp, "\n")
            escreva("vida do inimigo ", inihp,"\n")

            leia(decisao)
            se (decisaoini != 2) {
                se (inihp > 0) {
                    decisaoini = ataqueinimigo()
                    escolha (decisaoini) {
                        caso 0:
                            escreva("O inimigo aplicou um ataque\n")
                            hp -= iniataque / 2
                            pare
                        caso 1:
                            escreva("O inimigo errou o ataque\n")
                            pare
                    }
                }
            }
            escolha (decisao) {
                caso 1:
                    escreva("você atacou o inimigo\n")
                    inihp -= ataque / 2
                    pare

                caso 2:
                    escreva("você fugiu vacilão\n")
                    pare

                caso contrario:
                    escreva("opção invalida digite a opção novamente\n")
                    pare
            }


        }
         se (decisao == 2) {
            escreva("você fugiu do combate\n")
            escreva("você não recebeu xp da batalha")
        } senao se(hp <= 0) {
            escreva("você foi derrotado\n")
        } senao {
            escreva("você derrotou o inimigo\n")
            xp = gerarx()
            escreva("você ganhou ",xp," de xp")
        }
        
        	
        }
	
			
		}
		






/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 6519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */