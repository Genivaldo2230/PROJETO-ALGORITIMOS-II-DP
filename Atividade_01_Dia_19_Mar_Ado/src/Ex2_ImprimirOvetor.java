import java.util.Random;
import java.util.Scanner;

/*2. Imprimir o vetor;

* */
public class Ex2_ImprimirOvetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random(); // Cria um objeto da classe Random

        System.out.println("Digite entrada de Vetor Qtd ? :");
        int N;// Define o tamanho do vetor
        N =sc.nextInt(); //criação da quantida de vetor pelo ususario

        int[] vetor = new int[N]; // Cria um vetor de inteiros com N posições

        int M = 50; // Define o valor máximo dos números

        for (int i = 0; i < N; i++) {

            vetor[i] = rd.nextInt(M) + 1; // Atribui um número aleatório entre 1 e M à posição i do vetor

            System.out.println(vetor[i]); // Imprime o valor da posição i do vetor
        }
    }


}
