public class Solution4 {

    public static void main(String[] args) {

        double[] entrada1 = {5.1, 6.7, 4500}; //4689
        double[] entrada2 = {1, 5.7, 4800};

        System.out.println(calculoSalario(entrada1));
        System.out.println(calculoSalario(entrada2));
    }

    public static double calculoSalario(double[] input) {

        double tempoServico = input[0];
        double inflacao = input[1];
        double salario = input[2];

        double percentualReajuste;

        if (tempoServico >= 1 && tempoServico < 5) {
            percentualReajuste = 1.0;
        } else if (tempoServico >= 5 && tempoServico < 10) {
            percentualReajuste = 1.5;
        } else if (tempoServico >= 10) {
            percentualReajuste = 2.0;
        } else {
            percentualReajuste = 0.0;
        }

        double novoSalario = salario * (1 + ((percentualReajuste + inflacao) / 100));

        novoSalario = Math.round(novoSalario * 100) / 100.0;

        return novoSalario;
    }
}

