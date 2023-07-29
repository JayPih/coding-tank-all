public class Solution7 {
    public static int somaAlgarismos(int input) {
        if (input <= 0) {
            return -1;
        }

        int sum = 0;
        while (input > 0) {
            sum += input % 10; // Adiciona o último dígito ao total
            input /= 10; // Remove o último dígito do número
        }

        return sum;
    }
    public static void main(String[] args)
    {
        int num1 = 235;
        int resultado1 = somaAlgarismos(num1);
        System.out.println("Entrada: " + num1);
        System.out.println("Saída: " + resultado1);

        int num2 = 121;
        int resultado2 = somaAlgarismos(num2);
        System.out.println("Entrada: " + num2);
        System.out.println("Saída: " + resultado2);
    }
}

