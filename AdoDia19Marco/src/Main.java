import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int TAM = 10;
        int[] vetor = new int[TAM];

     int option= 0;
        do {

            System.out.println(" . Escolha uma opção:");
            System.out.println("1. Inicializar o vetor com numeros aleatorios");
            System.out.println("2. Imprimir o vetor");
            System.out.println("3. Verificar se um determinado numero esta contido no vetor");
            System.out.println("4. Buscar o maior nC:mero armazenado no vetor");
            System.out.println("5. Calcular a media dos numeros pares armazenados no vetor");
            System.out.println("6. Calcular Percentual Numeros Impares Armaz Vetor");
            System.out.println("7. Calcular Media Centralizada Vetor");
            System.out.println("8. Somados Valores Informado");
            System.out.println("0. Sair do programa");


            option = sc.nextInt();
            var i = 1;
            int indice = 0;
            switch (option) {
                case 1:
                    System.out.print("Digite o tamanho do vetor: ");
                    int n = sc.nextInt();
                    System.out.print("Digite um inteiro positivo M: ");
                    int m = sc.nextInt();

                    vetor = new int[n];
                    Random random = new Random();
                    for (i = 0; i < n; i++) {
                        vetor[i] = random.nextInt(m) + 1;
                    }
                    System.out.println("Vetor inicializado com sucesso!");

                    break;

                case 2:
                    rd.nextInt();
                    if (vetor == null) {
                        System.out.println("Vetor não inicializado!");
                    } else {
                        System.out.print("Vetor: ");
                        for ( i = 0; i < vetor.length; i++) {
                            System.out.print(vetor[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // Lê um número do usuário
                    System.out.println("Digite um número: ");
                    int numero = sc.nextInt();

                    // Cria uma variável booleana para indicar se o número foi encontrado ou não
                    boolean encontrado = false;

                    // Percorre todos os elementos do vetor
                    for (i = 0; numero > i; i++) {
                        // Se o elemento i do vetor for igual ao número digitado pelo usuário
                        if ( vetor[i] == numero ) {
                            // Muda o valor da variável booleana para verdadeiro
                            encontrado = true;
                            // Sai do laço for usando a instrução break
                        }
                    }
                    break;

                //break;

                case 4:

                    // Cria duas variáveis auxiliares para armazenar a soma e a contagem dos números
                    // pares
                    int somaPares = 0;
                    int contPares = 0;

                    // Percorre todos os elementos do vetor
                    for (i = 0; i < contPares; i++) {
                        // Se o elemento i do vetor for par (divisível por 2)
                        if ( vetor[i] % 2 == 0 ) {
                            // Incrementa a soma dos números pares com o elemento i do vetor
                            somaPares += vetor[i];
                            // Incrementa a contagem dos números pares em uma unidade
                            contPares++;
                        }
                    }

                    // Cria uma variável auxiliar para armazenar a média dos números pares
                    double mediaPares = 0.0;

                    // Se a contagem dos números pares for maior que zero
                    if ( contPares > 0 ) {
                        // Calcula a média dos números pares dividindo a soma pela contagem
                        mediaPares = (double) somaPares / contPares;
                    }

                    // Imprime o valor da variável auxiliar como a média dos números pares do vetor
                    System.out.println("A média dos números pares do vetor é: " + mediaPares);

                    // Cria uma variável auxiliar para armazenar a média dos números pares
                    mediaPares = 0.0;
                    break;
                case 5:
                    // Cria uma variável auxiliar para armazenar a contagem dos números ímpares
                    int contImpares = 0;
                    // Percorre todos os elementos do vetor
                    for (i = 0; i < contImpares; i++) {
                        // Se o elemento i do vetor for ímpar (não divisível por 2)
                        if ( vetor[i] % 2 != 0 ) {
                            // Incrementa a contagem dos números ímpares em uma unidade
                            contImpares++;
                        }
                    }
                    // Cria uma variável auxiliar para armazenar o percentual dos números ímpares
                    double percImpares = 0.0;

                    // Calcula o percentual dos números ímpares dividindo a contagem pelo tamanho do vetor e multiplicando por 100
                    percImpares = (double) contImpares / contImpares * 100;
                    // Imprime o valor da variável auxiliar como o percentual dos números ímpares do vetor
                    System.out.println("O percentual dos números ímpares do vetor é: " + percImpares + "%");

                    // Cria duas variáveis auxiliares para armazenar a soma e a média simples de todos os elementos do vetor
                    int somaTotal = 0;
                    double mediaSimples = 0.0;
                    // Percorre todos os elementos do vetor
                    for (i = 0; i < somaTotal; i++) {
                    }

                    break;
                case 6: {
                    rd.nextInt(10);
                    vetor = new int[]{rd.nextInt(10)};//quantidade de indice vetor
                    // Lê um valor do usuário
                    System.out.println("Digite um valor: ");
                    int valor = sc.nextInt();

                    // Cria uma variável booleana para indicar se existe ou não dois números que somados são iguais ao valor informado
                    boolean existe = false;

                    // Percorre todos os elementos do vetor
                    for (i = 0; i < vetor.length; i++) {
                        // Percorre todos os elementos do vetor a partir do próximo elemento de i6
                        for (int j = i + 1; j < vetor.length; j++) {
                            // Se a soma dos elementos i e j do vetor for igual ao valor informado pelo usuário
                            if ( vetor[i] + vetor[j] == valor ) {
                                // Informa ao usuário os números encontrados
                                System.out.println("Encontrei dois números: {0} e {1}" + vetor[i] + vetor[j]);
                                // Muda o valor da variável booleana para verdadeiro
                                existe = true;
                                // Sai dos laços for usando a instrução break duas vezes
                                break;
                            }
                        }
                        if ( existe ) {
                            break;
                        }
                    }
                } break;

                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    // sair do programa
                    break;

                default:

            }
            System.out.println("Opção Invalida.");

        } while (option != 0);

    }
}