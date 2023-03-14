//package MenuComAtividade;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;
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

        Object AtomicInteger;


        do {
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
                    vetor = new AtomicIntegerArray(new int[N]);
                    int M = 100;    // Define o valor mC!ximo dos nC:meros
                    for (i = 0; i < N; i++) {
                        vetor.set(i, rd.nextInt(M) + i);    // Atribui um nC:mero aleatC3rio entre 1 e M C  posiC'C#o i do vetor
                        System.out.println("Imprime o valor da posiC'C#o i do vetor : " + vetor.get(i) + "\n ");    // Imprime o valor da posiC'C#o i do vetor
                    }
                    break;

                case 2:
                    rd = new Random();
                    System.out.println("Digite entrada de Vetor Qtd ? :");
                    N = sc.nextInt();    //criaC'C#o da quantida de vetor pelo ususario
                    vetor = new AtomicIntegerArray(new int[N]);
                    M = 50;
                    for (i = 0; i < N; i++) {
                        vetor.set(i, rd.nextInt(M) + i);
                        System.out.println("Imprime o valor da posiC'C#o i do vetor [ " + vetor.get(i) + " ]" + "\n2Imprime o valor do vetor : " + M);    // Imprime o valor da posiC'C#o i do vetor
                    }
                    break;

                case 3:
                    sc = new Scanner(System.in);
                    int[] numeros = new int[]{10, 20, 30, 40};
                    System.out.println("Digite um numero: ");
                    AtomicLong numero = new AtomicLong(sc.nextInt());
                    numero.set(sc.nextInt());
                    indice = -1;
                    for (i = 0; i < numeros.length; i++) {
                        if (numeros[i] == numero.get()) {
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
        return 0;
    }
}