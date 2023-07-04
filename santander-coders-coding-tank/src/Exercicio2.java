import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= numero; i++) {

            for(int espaco=1; espaco<=numero-i; espaco++){
                System.out.print(" "); //imprimir espaços em branco
            }

            for (int asterisco=1; asterisco<=(i*2)-1; asterisco++){
                System.out.print("*"); //imprimir *
            }

            System.out.println(); //para a próxima interação seja impressa em uma nova linha
        }

        scan.close();
        System.out.println("Feliz natal Santander Coders!!");
    }
}

