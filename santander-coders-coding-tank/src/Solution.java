import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a entrada: ");
        String arrayValores = scan.nextLine(); //alocar a entrada

        String valoresFormatados = arrayValores.substring(1, arrayValores.length()-1); // tirar os colchetes

        String[] string = valoresFormatados.split(","); //dividir a string

        double[] input = new double[4]; // armazenar os valores

        for (int i = 0; i <= string.length-1; i++){
            input[i] = Double.parseDouble(string[i]); //converter os valores
        }

        DecimalFormat df = new DecimalFormat("#0.00"); //duas linhas decimais
        System.out.print(df.format(salarioComComissao(input))); //chamando o metodo e imprimindo
        scan.close();
    }

    public static double salarioComComissao( double[] input){

        double totalCarrosVendidos = input[0];
        double valorVendasMes = input[1];
        double salarioFixo = input[2];
        double valorFixo = input[3];

        double comissao1 = 0.05 * valorVendasMes;
        double comissao2 = totalCarrosVendidos * valorFixo;

        return comissao1 + comissao2 + salarioFixo;

    }

}
