public class EstruturaDeRepeticaoFor {

    public static void main(String[] args){

        //for while (do while)

        for(int i = 0; i < 10; i++){
            System.out.println("Contador: " + i);
        }


        int contador = 0;



        while(true){
            System.out.println("Contador: " + contador);
            contador++;
            if (contador == 99999)
                break;
        }




        while(contador < 10){
            System.out.println("Contador: " + contador);
            contador++;
        }

    }

}
