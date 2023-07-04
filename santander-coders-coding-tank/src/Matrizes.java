public class Matrizes {

    public static void main(String[] args) {

        int[][] arrayMultidimensional = new int[3][3];

        arrayMultidimensional[0][0] = 10;
        arrayMultidimensional[0][1] = 15;
        arrayMultidimensional[0][2] = 20;

        arrayMultidimensional[1][0] = 30;
        arrayMultidimensional[1][1] = 35;
        arrayMultidimensional[1][2] = 40;

        arrayMultidimensional[2][0] = 50;
        arrayMultidimensional[2][1] = 55;
        arrayMultidimensional[2][2] = 60;

        for (int colunas = 0; colunas < arrayMultidimensional.length; colunas++) {
            for (int linhas = 0; linhas < arrayMultidimensional[colunas].length; linhas++) {
                System.out.print(arrayMultidimensional[colunas][linhas] + " ");
            }
            System.out.println();
        }
    }
}

