import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a entrada: ");
        String arrayValores = scan.nextLine();

        String valoresFormatados = arrayValores.substring(1, arrayValores.length() - 1);
        String[] string = valoresFormatados.split(",");

        double[] input = new double[3];

        for (int i = 0; i < string.length; i++) {
            input[i] = Double.parseDouble(string[i]);
        }

        double[] resultado = custosCarro(input);

        DecimalFormat df = new DecimalFormat("#.00");
        String percentualDistribuidorFormatado = df.format(resultado[0]);
        String percentualImpostosFormatado = df.format(resultado[1]);

        System.out.println("[" + percentualDistribuidorFormatado + ", " + percentualImpostosFormatado + "]");
        scan.close();
    }

    public static double[] custosCarro(double[] input) {

        double precoFinalFabrica = input[0];
        double valorCustoDistribuidor = input[1];
        double valorPrecoImpostos = input[2];

        double percentualCustoDistribuidor = (valorCustoDistribuidor / precoFinalFabrica) * 100;
        double percentualCustoImpostos = (valorPrecoImpostos / precoFinalFabrica) * 100;

        return new double[]{percentualCustoDistribuidor, percentualCustoImpostos};
    }
}



