import java.util.Scanner;

public class ControleFluxoSwitchCase {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe  um dia da semana em número: ");
        int diaDaSemana  = scan.nextInt();

        switch (diaDaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Número inválido.");
        }

    }

}
