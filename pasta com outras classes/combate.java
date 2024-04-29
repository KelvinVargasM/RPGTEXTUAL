import java.util.Scanner;


public class combate {
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
                    escolhaini = inimigo.ataqueinimigo();
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

}