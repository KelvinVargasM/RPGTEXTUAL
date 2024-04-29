import java.util.Scanner;

public class logicajogo {

        static Scanner receber = new Scanner(System.in);

        //limpar o console
    public static void clearconsole(){
        for(int i =0;i<10;i++){
            System.out.println();
        }
    }
    public static void separador(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("-");
            System.out.println();
        }
    }
        // cabeçalho
        public static void colarcabecalho(String titulo){
            separador(30);
            System.out.println(titulo);
            separador(30);
        }
    }
