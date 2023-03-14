package MenuComVetor;

import java.util.Random;
import java.util.Scanner;
/*
Entrega a Atividade 1 - Algoritmos e Programação II
Autor Nome completo :Genivaldo Alves Dos Anjos :  declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/

public class Ex1_InicializarVetorAleatorio extends MenuConsole{

     public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        Random rd = new Random(); // Cria um objeto da classe Random

        System.out.println("Digite entrada de Vetor Qtd ? :");
        int N;// Define o tamanho do vetor
        N = sc.nextInt(); //criação da quantida de vetor pelo ususario

        int[] vetor = new int[N]; // Cria um vetor de inteiros com N posições

        int M = 100; // Define o valor máximo dos números

        for (int i = 0; i < N; i++) {

            vetor[i] = rd.nextInt(M) + 1; // Atribui um número aleatório entre 1 e M à posição i do vetor

            System.out.println(vetor[i]); // Imprime o valor da posição i do vetor
        }
    }
}