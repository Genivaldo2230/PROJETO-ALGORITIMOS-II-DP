package Aula04_Dia03_03_ExercíciosSobreMatrizes;
/*
O traço de uma matriz ea soma dos elementos de usa daigonal princiapl Crie uma função que uma Matriz quadrada (numero de linhas =
nunero de colunas )  e devolva o seu traços
 */
public class Exercicio04 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 2, 3, 4},
                {4, 6, 8, 0},
                {1, 3, 5, 7},
                {2, 9, 8, 7}
        };
        int traco = traco(m);
        System.out.println("Traco da Matriz = " + traco);
    }

    public static int traco(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            soma += m[i][i];
        }
        return soma;
    }

    public static int traco1(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    // soma = soma + m[i][j];
                    soma += m[i][j];
                }
            }
        }
        return soma;
    }
}