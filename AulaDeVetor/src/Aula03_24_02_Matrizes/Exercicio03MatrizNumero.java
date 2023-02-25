package Aula03_24_02_Matrizes;

import java.util.Random;

/*GERADO DE MATRIZ NUMEROS FIXOS DE 0 A 100  USANDO VETOR BIDIMENCIONAL */
public class Exercicio03MatrizNumero {
    public static void main(String[] args) {
        int[][] matriz = gerarMatriz(8, 5);
        imprimir(matriz);
        int maior = maiorElemento(matriz);
        System.out.println("Maior elemento = " + maior);
    }

    public static int maiorElemento(int[][] m) {
        int maior = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }
        return maior;
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