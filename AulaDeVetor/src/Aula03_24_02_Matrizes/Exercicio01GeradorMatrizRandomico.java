package Aula03_24_02_Matrizes;

/*gerador de matriz em Randomico
* */
import java.util.Random;
import java.util.Scanner;

public class Exercicio01GeradorMatrizRandomico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Linhas: ");
        int linhas = leitor.nextInt();
        System.out.print("Colunas: ");
        int colunas = leitor.nextInt();
        int[][] m = gerarMatriz(linhas, colunas);
        imprimir(m);
    }

    public static int[][] gerarMatriz(int linhas, int colunas) {
        Random r = new Random();
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(101);
            }
        }
        return matriz;
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