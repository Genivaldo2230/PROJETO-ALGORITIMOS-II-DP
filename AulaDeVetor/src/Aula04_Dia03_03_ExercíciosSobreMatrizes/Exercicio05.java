package Aula04_Dia03_03_ExercíciosSobreMatrizes;
/*
Uma matriz quadrada A é simetrica se e somente se A[i][j]= A[j][i].
Crie a função para verificar se uma matriz de numro inteira eo simetrico, se a matriz for simetrica sua função retorna
true e fa\lse caso contrario
 */
public class Exercicio05 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 2, 2, 2, 2},
                {2, 1, 3, 3, 3},
                {2, 3, 1, 4, 4},
                {6, 3, 4, 1, 5},
                {2, 3, 4, 5, 1}
        };
        boolean simetrica = ehSimetrica(m);
        if (simetrica) {
            System.out.println("A matriz é simétrica!");
        }
        else {
            System.out.println("A matriz não é simétrica!");
        }

    }

    public static boolean ehSimetrica(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != m[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}