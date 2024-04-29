import java.util.Random;
import java.util.Scanner;


public class principal {
    static int velocidade = 10;
    //inimigo
    static int inivelocidade = 14;
    public static void clearconsole(){
        for(int i =0;i<10;i++){
            System.out.println();
        }
    }
    static int ataqueinimigo(){
        Random gerador = new Random();
        return gerador.nextInt(2);

    }
    public static void luta() {
        Scanner receber = new Scanner(System.in);
        int escolha = 0;

        //personagem

        int hp = 20, ataque = 6, defesa = 6, velocidade = 6;
        //inimigo
        int inihp = 20, iniataque = 3, inicdefesa = 3, inivelocidade = 3;


        while (hp > 0 && inihp > 0 && escolha != 2) {
            System.out.println("==================================================================");
            System.out.println("você entrou no combate selecione a opção para (1) atacar ou (2) correr");
            System.out.println("==================================================================");
            System.out.printf("vida do usuario %d\n", hp);
            System.out.printf("vida do inimigo %d\n", inihp);

            escolha = receber.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("você atacou o inimigo");
                    inihp -= ataque / 2;
                    break;

                case 2:
                    System.out.println("você fugiu vacilão");
                    break;

                default:
                    System.err.println("opção invalida digite a opção novamente");
                    break;
            }
            if (escolha != 2) {
                if (inihp > 0) {
                    escolha = ataqueinimigo();
                    switch (escolha) {
                        case 0:
                            System.out.println("O inimigo aplicou um ataque");
                            hp -= iniataque / 2;
                            break;
                        case 1:
                            System.out.println("O inimigo errou o ataque");
                            break;
                    }
                }
            }

        }


        if (escolha == 2) {
            System.out.println("você fugiu do combate");
        } else if (hp <= 0) {
            System.out.println("você foi derrotado");
        } else {
            System.out.println("você derrotou o inimigo");
        }
    }
    static void lutaini() {
        Scanner receber = new Scanner(System.in);
        int escolha = 0,escolhaini = 0;;

        //personagem

        int hp = 20, ataque = 6, defesa = 6, velocidade = 6;
        //inimigo
        int inihp = 20, iniataque = 3, inicdefesa = 3, inivelocidade = 3;


        while (hp > 0 && inihp > 0 && escolha != 2) {
            System.out.println("==================================================================");
            System.out.println("você entrou no combate selecione a opção para (1) atacar ou (2) correr");
            System.out.println("==================================================================");
            System.out.printf("vida do usuario %d\n", hp);
            System.out.printf("vida do inimigo %d\n", inihp);

            escolha = receber.nextInt();
            if (escolhaini != 2) {
                if (inihp > 0) {
                    escolhaini = ataqueinimigo();
                    switch (escolhaini) {
                        case 0:
                            System.out.println("O inimigo aplicou um ataque");
                            hp -= iniataque / 2;
                            break;
                        case 1:
                            System.out.println("O inimigo errou o ataque");
                            break;
                    }
                }
            }
            switch (escolha) {
                case 1:
                    System.out.println("você atacou o inimigo");
                    inihp -= ataque / 2;
                    break;

                case 2:
                    System.out.println("você fugiu vacilão");
                    break;

                default:
                    System.err.println("opção invalida digite a opção novamente");
                    break;
            }


        }

        if (escolha == 2) {
            System.out.println("você fugiu do combate");
        } else if (hp <= 0) {
            System.out.println("você foi derrotado");
        } else {
            System.out.println("você derrotou o inimigo");
        }



    }


    public static void main(String[] args) {
        String nome, escolha = "";
        int menuclass = 0;

        Scanner receber = new Scanner(System.in);

        System.out.println("Insira o nome do personagem");
        nome = receber.next();
        clearconsole();


        while (menuclass != 1 && menuclass != 2 && menuclass != 3 && menuclass != 4) {
            System.out.println("selecione a classe do personagem \n1-Guerreiro \n2-Ladrão \n3-Barbaro \n4-Druida");
            menuclass = receber.nextInt();
            switch (menuclass) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:


                    break;

            }
        }
        System.out.printf("Bem vindo jogador %s\n", nome);




        do {
            System.out.println("Primeira ação - digite a sua escolha: direita ou esquerda?");
            escolha = receber.next();
            switch (escolha) {
                case "direita":
                    System.out.println("você encontrou aranha nivel 1\n");
                    break;
                case "esquerda":
                    System.out.println("você encontrou aranha nivel 2\n");
                    break;
                default:
                    System.err.println("entrada de dados invalida");
                    break;

            }

        } while (!escolha.equalsIgnoreCase("direita") && !escolha.equalsIgnoreCase("esquerda"));

        System.out.println("você encontrou o inimigo");
        if (velocidade>inivelocidade) {
            luta();
        }else{
            lutaini();
        }
    }
}