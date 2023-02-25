package Aula02_17_02_ExercíciosSobreVetor;

import java.util.Arrays;

/*
* Criar uma função que receba como parâmetro um vetor de inteiros e
inverte os elementos deste vetor.
* */
public class Exercicio1 {

    public static void main(String[] args) {
        int[] vetor = {3, 7, 8, 9, 2, 4, 5};
        inverter(vetor);
        System.out.println(Arrays.toString(vetor));
    }

    public static void inverter(int[] numeros) {
        int aux;
        for (int i = 0; i < numeros.length / 2; i++) {
            aux = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = aux;
        }
    }
}