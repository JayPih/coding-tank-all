public class Solution8
{
    public static String geraRecibo(double[] input)
    {
        if (input == null || input.length == 0) {
            return "Array vazio.";
        }

        double valorTotalSemDescontos = 0;
        double valorDescontos = 0;

        for (int i = 0; i < input.length; i += 2) {
            double precoAtual = input[i];
            valorTotalSemDescontos += precoAtual;

            if (i + 1 < input.length) {
                double proximoPreco = input[i + 1];
                double menorPreco = Math.min(precoAtual, proximoPreco);
                valorDescontos += menorPreco * 0.5;
            }
        }

        double valorTotalComDescontos = valorTotalSemDescontos - valorDescontos;

        return String.format("Valor total: %.1f | Valor de descontos: %.1f | Valor a pagar: %.1f",
                valorTotalSemDescontos, valorDescontos, valorTotalComDescontos);
    }

    public static void main(String[] args)
    {
        double[] array1 = {20.0, 40.0};
        System.out.println(geraRecibo(array1));

        double[] array2 = {20.0, 40.0, 30.0};
        System.out.println(geraRecibo(array2));

        double[] array3 = {20.0, 80.0, 60.0, 40.0};
        System.out.println(geraRecibo(array3));
    }
}



