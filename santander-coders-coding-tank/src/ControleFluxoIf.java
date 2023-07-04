import java.util.Scanner;

public class ControleFluxoIf {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, informe o nome do usuário:  ");
        String nome = scan.nextLine();

        System.out.println("Por favor, informe o salário: ");
        double salario = scan.nextDouble();

        System.out.println("Por favor, informe o tempo de casa: ");
        int tempoDeCasa = scan.nextInt();

        boolean isSalarioMenorQueDoisMil = salario < 2000;

        boolean isTempoDeCasaMaiorQueUmAno = tempoDeCasa >= 1;

        // operadores lógicos && (and ou e)  ||  ( ou / or )  !  (negação)

        if (isSalarioMenorQueDoisMil && isTempoDeCasaMaiorQueUmAno){
            System.out.println(nome + "Usuário apto a promoção");
        }  else {
            System.out.println("Usuário inapto para a promoção");
        }

        // if ternário  tem que retornar um valor
        // condição (? true) (: false)

        String mensagem = isSalarioMenorQueDoisMil
                && isTempoDeCasaMaiorQueUmAno ? nome + " está apto a promoção" : nome + " não está apto a promoção";

        System.out.println(mensagem);

    }

}
