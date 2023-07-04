public class Metodos {

    public static void main(String[] args) {

        int numero1 = 5;
        int numero2 = 10;

        System.out.println(somar(numero1, numero2));

    }

    //[modificadorDeVisibilidade] [static ou nada] [retorno] [nome](argumentos)
    public static int somar(int numero1, int numero2){
        return numero1 + numero2;
    }

}
