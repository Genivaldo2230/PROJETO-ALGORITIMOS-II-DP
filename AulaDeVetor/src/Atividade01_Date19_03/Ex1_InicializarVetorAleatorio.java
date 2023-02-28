package Atividade01_Date19_03;
import java.util.Random;
import java.util.Scanner;
/*
1) Inicializar o vetor com números aleatórios; Enquanto o usuário não escolher essa operação as outras operações não poderão
executar, pois o vetor estará vazio. Quando o usuário selecionar essa opção o programa solicita o tamanho do vetor N e um
inteiro positivo M, em seguida é criado um vetor com N posições e preenchida as posições do vetor com números inteiros positivos
gerados aleatoriamente menores ou iguais a M. Nessa operação não é necessário fazer uma função você pode implementar ela direto no
programa que faz o menu de opções.
*/
public class Ex1_InicializarVetorAleatorio {
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
