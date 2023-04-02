/*
Este código modifica o método de ordenação por inserção para verificar se o número atual é par e o anterior é ímpar.
Se for verdadeiro, ele troca os dois números e continua a verificar até que todos os números pares estejam à frente dos
ímpares. Isso resolve o problema sem usar outro vetor como área auxiliar.
 */

import java.util.Arrays;
import java.util.Random;

public class InsertionPar_Impar {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] num = {5, 9, 1, 2, 3, 4, 6, 7, 8};
                // int[] num = new int[]{rd.nextInt(10)};
        //System.out.println("Numero Impares = " + Arrays.toString(num));
        insertionSort(num);
        System.out.println("Vetor Ordem Par " + Arrays.toString(num));
    }

        public static void insertionSort ( int[] num){
            for (int i = 1; i < num.length; i++) {
                int j = i;
                while (j > 0 && num[j - 1] % 2 != 0 && num[j] % 2 == 0) {
                    int aux = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = aux;
                    j--;

                }
            }
        }
    }


