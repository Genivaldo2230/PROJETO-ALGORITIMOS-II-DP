package Aula04_Dia03_03_ExercíciosSobreMatrizes;
/*
Dado a Matriz A , crie uma função que recebe a matriz  A por parametro , em seguida a função aloca e desvolver
sua transposta A, onde A[i][j] = A[j] A[i] para qualque i e j.
exemplos , se A
{0, 6},
{-1, 2},
{5, 0}
a matriz transposta representada por A sera   0  -1   5
                                              6   2   0
 */
public class Exercicio02 {
    public static void main(String[] args) {
        int[][] a = {
                {0, 6},
                {-1, 2},
                {5, 0}
        };
        int[][] at = transposta(a);
        System.out.println("*** MATRIZ A ***");
        imprimir(a);
        System.out.println("*** MATRIZ TRANSPOSTA ***");
        imprimir(at);
    }

    public static int[][] transposta(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
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
