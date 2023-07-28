import java.util.Scanner;

public class ExercicioSantander1 {
    public static void main(String[] args) {

        if (args.length == 0) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro número:");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double numero2 = scanner.nextDouble();

            scanner.close();

            Soma(numero1, numero2);

        } else if (args.length == 1) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o segundo número:");
            double numero2 = scanner.nextDouble();

            scanner.close();

            Soma(Double.parseDouble(args[0]), numero2);

        } else if (args.length == 2) {

            double numero1 = Double.parseDouble(args[0]);
            double numero2 = Double.parseDouble(args[1]);

            Soma(numero1, numero2);

        } else {

            System.err.println("Quantidade inválida de parâmetros.");

        }
    }

    public static void Soma(double numero1, double numero2) {

        double soma = numero1 + numero2;

        System.out.println("A soma dos números é: " + soma);

    }
}

