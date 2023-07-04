import java.util.Scanner;

public class PraticaArraysMetodos {

    public static void main(String[] args) {

        //receber N nomes
        //formatar esses nomes
        //imprimir na tela

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos nomes deseja informar? ");
        int tamanho = scan.nextInt();

        String[] nomes = new String[tamanho];

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Informe o " + (i + 1) + " nome: ");
            nomes[i] = scan.nextLine();
        }

        for (String nome : nomes) {
            System.out.println(formatarNome(nome));
        }

        scan.close();

    }

    public static String formatarNome(String nome){
        return nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
    }

}
