public class Arrays {

    public static void main(String[] args){

        //[0] [1] [2]

        String[] nomes = new String[3];
        String[] nomes2 = {"Rodolfo", "Alex", "Jp"};
        nomes[0] = "Rodolfo";
        nomes[1] = "Alex";
        nomes[2] = "Jp";

        System.out.println(nomes2[2]);

        for(int i = 0; i < nomes2.length; i++){
            System.out.println(nomes2[i]);
        }

        //para cade nome em nomes, imprima:
        for (String nome: nomes2) {
            System.out.println(nome);
        }

    }
}
