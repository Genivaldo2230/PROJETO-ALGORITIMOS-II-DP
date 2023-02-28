package Aula04_Dia03_03_ExercíciosSobreMatrizes;
/*
Criar uma função que receber por parametros duas matrizes A e B com n linhas  e m  colunas .
Sua  função deve Clacular  asoma de A+B e amarzenar na matriz C nxm eo fianl retorna a Matriz C.
 */
public class Exercicio06 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 3},
                {5, 7},
                {9, 0}
        };
        int[][] b = {
                {2, 4},
                {6, 8},
                {0, 0}
        };
        int[][] c = soma(a, b);
        imprimir(c);
    }

    public static int[][] soma(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void imprimir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();
        }
    }
}
