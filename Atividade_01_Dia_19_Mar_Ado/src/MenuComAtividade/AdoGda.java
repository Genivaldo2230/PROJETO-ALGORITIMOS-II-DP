package MenuComAtividade;

import java.util.Random;
import java.util.Scanner;

public class AdoGda {

    public static void inicializarVetor(int[] vetor) {
        Random rand = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100); // Gera um número aleatório entre 0 e 99
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static boolean verificarNumero(int[] vetor, int numero) {
        for (int n : vetor) {
            if (n == numero) {
                return true; // Retorna true se o número foi encontrado
            }
        }
        return false; // Retorna false se o número não foi encontrado
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;
        do {
            System.out.println("Escolha uma opC'C#o:");
            System.out.println("==========================================================================");
            System.out.println("1. Inicializar o vetor com nC:meros aleatC3rios");
            System.out.println("==========================================================================");
            System.out.println("2. Imprimir o vetor");
            System.out.println("==========================================================================");
            System.out.println("3. Verificar se um determinado nC:mero estC! contido no vetor");
            System.out.println("==========================================================================");
            System.out.println("4. Buscar o maior nC:mero armazenado no vetor");
            System.out.println("==========================================================================");
            System.out.println("5. Calcular a mC)dia dos nC:meros pares armazenados no vetor");
            System.out.println("==========================================================================");
            System.out.println("6. Calcular Percentual Numeros Impares Armaz Vetor");
            System.out.println("==========================================================================");
            System.out.println("7. Calcular Media Centralizada Vetor");
            System.out.println("==========================================================================");
            System.out.println("8. Somados Valores Informado");
            System.out.println("==========================================================================");
            System.out.println("0. Sair do programa");

            option = sc.nextInt();
            var i = 1;
            int indice = 0;
            switch (option) {
                case 1:
                    Random rd = new Random();    // Cria um objeto da classe Random
                    System.out.println("Digite entrada de Vetor Qtd ? :");
                    int N = 0;    // Define o tamanho do vetor
                    N = sc.nextInt();    //criaC'C#o da quantida de vetor pelo ususario
                    int[] vetor = new int[N];
                    int M = 100;    // Define o valor mC!ximo dos nC:meros
                    for (i = 0; i < N; i++) {
                        vetor[i] = rd.nextInt(M) + i;    // Atribui um nC:mero aleatC3rio entre 1 e M C  posiC'C#o i do vetor
                        System.out.println("Imprime o valor da posiC'C#o i do vetor : " + vetor[i] + "\n ");    // Imprime o valor da posiC'C#o i do vetor
                    }
                    break;

                case 2:
                    rd = new Random();
                    System.out.println("Digite entrada de Vetor Qtd ? :");
                    N = sc.nextInt();    //criaC'C#o da quantida de vetor pelo ususario
                    vetor = new int[N];
                    M = 50;
                    for (i = 0; i < N; i++) {
                        vetor[i] = rd.nextInt(M) + i;
                        System.out.println("Imprime o valor da posiC'C#o i do vetor [ " + vetor[i] + " ]" + "\n2Imprime o valor do vetor : " + M);    // Imprime o valor da posiC'C#o i do vetor
                    }
                    break;

                case 3:
                    sc = new Scanner(System.in);
                    vetor = new int[]{10, 20, 30, 40};
                    System.out.println("Digite um numero: ");
                    int numero = sc.nextInt();
                    numero = sc.nextInt();
                    indice = -1;
                    for (i = 0; i < vetor.length; i++) {
                        if (vetor[i] == numero) {
                            indice = i;
                        }
                    }
                    if (indice != -1) {
                        System.out.println("O nC:mero estC! contido no vetor na posiC'C#o " + indice);
                    } else {
                        System.out.println("O nC:mero nC#o estC! contido no vetor.");
                    }
                    break;

                case 4:
                    rd = new Random();
                    vetor = new int[50];
                    rd.nextInt(100);
                    System.out.println("O nC:mero gerado foi: + numero ");
                    indice = -1;
                    for (i = 0; i < vetor.length; i++) {
                        if (vetor[i] == sc.nextInt()) {        /*numero.get () ) { */
                            indice = i;
                            break;
                        }
                    }
                    if (indice != -1) {
                        System.out.println("\nO nC:mero estC! contido no vetor na posiC'C#o " + indice);
                        System.out.println("==========================================================================");
                    } else {
                        System.out.println("\nO nC:mero nC#o estC! contido no vetor.");
                        System.out.println("==========================================================================");
                    }
                    break;

                case 5: // Calcular a média dos números pares armazenados no vetor
                    vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    double mediaPares = mediaPares(vetor);
                    System.out.printf("A média dos números pares no vetor é %.2f\n", mediaPares);
                    break;

                case 6: // Calcular o percentual dos números ímpares armazenados no vetor
                    vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    double percentualImpares;
                    percentualImpares = percentualImpares(vetor);
                    System.out.printf("O percentual de números ímpares no vetor é %.2f%%\n", percentualImpares);
                    break;

                case 7: // Calcula a média centralizada dos números armazenados no vetor
                    int[] vetor2 = {4, 5, 6, 7, 8, 9, 10};
                    double mediaCentralizada = mediaCentralizada(vetor2);
                    System.out.printf("A média centralizada do vetor é %.2f\n", mediaCentralizada);
                    break;

                case 8:
                    vetor = new int[]{1, 2, 3};
                    int sum = 0;
                    for (i = 0; i < vetor.length; i++) {
                        sum += vetor[i];
                    }
                    int matriz = sum / vetor.length;
                    System.out.println("Matriz Tem : " + matriz);

                    break;

                case 0:
                    // sair do programa
                    break;
                default:
                    System.out.println("Opção invC!lida.");


            }

        } while (option != 0);
    }

    private static double mediaCentralizada(int[] ints) {
        return 0;
    }

    private static double percentualImpares(int[] vetor) {
        return 0;
    }

    private static double mediaPares(int[] vetor) {
        return 0;
    }
}