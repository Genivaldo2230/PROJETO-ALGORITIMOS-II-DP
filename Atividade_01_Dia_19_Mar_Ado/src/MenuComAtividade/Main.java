//package MenuComAtividade;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;
<<<<<<< HEAD
import java.util.concurrent.atomic.AtomicLong;


public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        Random rand = new Random();


        int option;


        AtomicIntegerArray vetor = new AtomicIntegerArray(new int[0]);


        vetor = new AtomicIntegerArray(new int[0]);


        double mediaCentralizada;


        //  int[] numeros;
        //numeros = new int[0];
=======


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        int option;
        int[] vetor;
        vetor = new int[0];
        double percentualImpares;
        int[] numeros;
        numeros = new int[0];
>>>>>>> origin/master

        Object AtomicInteger;


        do {
<<<<<<< HEAD
            System.out.println("Escolha uma opção:");
            System.out.println("==========================================================================");
            System.out.println("1. Inicializar o vetor com numeros aleatC3rios");
            System.out.println("==========================================================================");
            System.out.println("2. Imprimir o vetor");
            System.out.println("==========================================================================");
            System.out.println("3. Verificar se um determinado numero esta contido no vetor");
            System.out.println("==========================================================================");
            System.out.println("4. Buscar o maior nC:mero armazenado no vetor");
            System.out.println("==========================================================================");
            System.out.println("5. Calcular a media dos numeros pares armazenados no vetor");
=======
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
>>>>>>> origin/master
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
<<<<<<< HEAD
                    vetor = new AtomicIntegerArray(new int[N]);
                    int M = 100;    // Define o valor mC!ximo dos nC:meros
                    for (i = 0; i < N; i++) {
                        vetor.set(i, rd.nextInt(M) + i);    // Atribui um nC:mero aleatC3rio entre 1 e M C  posiC'C#o i do vetor
                        System.out.println("Imprime o valor da posiC'C#o i do vetor : " + vetor.get(i) + "\n ");    // Imprime o valor da posiC'C#o i do vetor
=======
                    vetor = new int[N];
                    int M = 100;    // Define o valor mC!ximo dos nC:meros
                    for (i = 0; i < N; i++) {
                        vetor[i] = rd.nextInt(M) + i;    // Atribui um nC:mero aleatC3rio entre 1 e M C  posiC'C#o i do vetor
                        System.out.println("Imprime o valor da posiC'C#o i do vetor : " + vetor[i] + "\n ");    // Imprime o valor da posiC'C#o i do vetor
>>>>>>> origin/master
                    }
                    break;

                case 2:
                    rd = new Random();
                    System.out.println("Digite entrada de Vetor Qtd ? :");
                    N = sc.nextInt();    //criaC'C#o da quantida de vetor pelo ususario
<<<<<<< HEAD
                    vetor = new AtomicIntegerArray(new int[N]);
                    M = 50;
                    for (i = 0; i < N; i++) {
                        vetor.set(i, rd.nextInt(M) + i);
                        System.out.println("Imprime o valor da posiC'C#o i do vetor [ " + vetor.get(i) + " ]" + "\n2Imprime o valor do vetor : " + M);    // Imprime o valor da posiC'C#o i do vetor
=======
                    vetor = new int[N];
                    M = 50;
                    for (i = 0; i < N; i++) {
                        vetor[i] = rd.nextInt(M) + i;
                        System.out.println("Imprime o valor da posiC'C#o i do vetor [ " + vetor[i] + " ]" + "\n2Imprime o valor do vetor : " + M);    // Imprime o valor da posiC'C#o i do vetor
>>>>>>> origin/master
                    }
                    break;

                case 3:
                    sc = new Scanner(System.in);
<<<<<<< HEAD
                    int[] numeros = new int[]{10, 20, 30, 40};
                    System.out.println("Digite um numero: ");
                    AtomicLong numero = new AtomicLong(sc.nextInt());
                    numero.set(sc.nextInt());
                    indice = -1;
                    for (i = 0; i < numeros.length; i++) {
                        if (numeros[i] == numero.get()) {
=======
                    numeros = new int[]{10, 20, 30, 40};
                    System.out.println("Digite um numero: ");
                    int numero = sc.nextInt();
                    numero = sc.nextInt();
                    indice = -1;
                    for (i = 0; i < numeros.length; i++) {
                        if (numeros[i] == numero) {
>>>>>>> origin/master
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
                    numeros = new int[50];
                    rand.nextInt(100);
                    System.out.println("O nC:mero gerado foi: + numero ");
                    indice = -1;
                    for (i = 0; i < numeros.length; i++) {
                        if (numeros[i] == sc.nextInt()) {        /*numero.get () ) { */
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
<<<<<<< HEAD
                case 5:
                    vetor = new AtomicIntegerArray(new int[0]);
                    vetor = new AtomicIntegerArray(new int[0]);
                    vetor = new AtomicIntegerArray(new int[vetor.length()]);
                    int media = (int) (int) mediaNumerosPares(vetor);
                    System.out.println("A média dos números pares é: " + media);
                    break;

                /*case 5:5
                    
                    double[] percentualImpares;
                    int[] vetores;
                    int impares = 0;    // Contador de nC:meros C-mpares
                    for (int num : vetor) {        // LaC'o para percorrer o vetor
                        if (num % 2 != 0) {        // Verifica se o nC:mero C) C-mpar
                            impares++;    // Incrementa o contador
                        }
                    }
                    final var i1 = impares * 100 / vetor.length;
                    boolean ssi1;
                    ssi1 = false;
                    if (ssi1) ;    // Retorna o percentual de C-mpares
                    break;*/


                case 0: {
                    // sair do programa
                   break;
                    //default:

                }
            }  System.out.println("Opção Invalida.");
        } while (option != 0);
    }

    private static double mediaNumerosPares(AtomicIntegerArray vetor) {
=======

                case 5: // Calcular a média dos números pares armazenados no vetor
                    vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    double mediaPares = mediaPares(vetor);
                    System.out.printf("A média dos números pares no vetor é %.2f\n", mediaPares);
                    break;

                case 6: // Calcular o percentual dos números ímpares armazenados no vetor
                    vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
            }
            break;
            /*case 0: {
                // sair do programa*/
            //default:

        }while (option != 0);
        }



    private static double mediaPares(int[] vetor) {
        return 0;
    }

    private static double percentualImpares(int[] vetor) {
        return 0;
    }

    private static double mediaCentralizada(int[] vetor2) {
>>>>>>> origin/master
        return 0;
    }
}