import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int contadorNotas = 0;

        while(true) {

            System.out.print("Digite uma nota de 0 a 10: ");
            double nota = scanner.nextDouble();

            if (nota < 0) break;

            if (!(nota <= 10)) {
                System.err.println("Nota inválida. Digite uma nota entre 0 e 10.");
            } else {
                soma = soma + nota;
                contadorNotas++;
            }
        }

        if (contadorNotas == 0) {
            System.out.println("Nenhuma nota válida foi digitada.");
        } else {
            double media = soma / contadorNotas;
            System.out.println("Média aritmética: " + media);
            System.out.println("Quantidade de notas digitadas: " + contadorNotas);
        }

        scanner.close();
    }
}

