public class Solution6 {
    public static double custoCompra(double quantidade) {

        String frutaPromocao = "Tomate";

        double precoPromocao = 1.25;
        double precoNormal = 1.45;

        double valorFinal;
        if (quantidade > 10 && frutaPromocao != null) {
            valorFinal = quantidade * precoPromocao;
        } else {
            valorFinal = quantidade * precoNormal;
        }

        valorFinal = Math.round(valorFinal * 100.0) / 100.0;

        return valorFinal;
    }
}