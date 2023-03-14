package MenuComAtividade;

import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        sc.nextInt();
        rd.nextInt(100);
        // Define o tamanho do vetor como uma constante
        int TAM = 10;
        int option = 0;
        // Declara o vetor como um array de inteiros
        int[] vetor;
        vetor = new int[TAM];
        do {
            switch (option) {

                // Percorre todos os elementos do vetor
                for (int i = 0; i < TAM; i++) {
                    // Atribui um número aleatório entre 0 e 99 ao elemento i do vetor
                    vetor[i] = rd.nextInt(100);
                }
                case 2:
                    // Percorre todos os elementos do vetor
                    for (int i = 0; i < TAM; i++) {
                        // Imprime o elemento i do vetor seguido de um espaço
                        System.out.print(vetor[i] + " ");
                    }
                    // Imprime uma quebra de linha após imprimir todos os elementos
                    System.out.println();

                    break;

                case 3:
                    // Lê um número do usuário
                    System.out.println("Digite um número: ");
                    int numero = sc.nextInt();

                    // Cria uma variável booleana para indicar se o número foi encontrado ou não
                    boolean encontrado = false;

                    // Percorre todos os elementos do vetor
                    for (int i = 0; TAM > i; i++) {
                        // Se o elemento i do vetor for igual ao número digitado pelo usuário
                        if ( vetor[i] == numero ) {
                            // Muda o valor da variável booleana para verdadeiro
                            encontrado = true;
                            // Sai do laço for usando a instrução break
                            break;
                            case 4:
                                // Cria duas variáveis auxiliares para armazenar a soma e a contagem dos números pares
                                int somaPares = 0;
                                int contPares = 0;

                                // Percorre todos os elementos do vetor
                                for (i = 0; i < TAM; i++) {
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
                                for (int i = 0; i < TAM; i++) {
                                    // Se o elemento i do vetor for ímpar (não divisível por 2)
                                    if ( vetor[i] % 2 != 0 ) {
                                        // Incrementa a contagem dos números ímpares em uma unidade
                                        contImpares++;
                                    }
                                }

                                // Cria uma variável auxiliar para armazenar o percentual dos números ímpares
                                double percImpares = 0.0;

                                // Calcula o percentual dos números ímpares dividindo a contagem pelo tamanho do vetor e multiplicando por 100
                                percImpares = (double) contImpares / TAM * 100;

                                // Imprime o valor da variável auxiliar como o percentual dos números ímpares do vetor
                                System.out.println("O percentual dos números ímpares do vetor é: " + percImpares + "%");


                                // Cria duas variáveis auxiliares para armazenar a soma e a média simples de todos os elementos do vetor
                                int somaTotal = 0;
                                double mediaSimples = 0.0;

                                // Percorre todos os elementos do vetor
                                for (int i = 0; i < TAM; i++) {

                                    break;

                                    case 6:
                                        // Lê um valor do usuário
                                        System.out.println("Digite um valor: ");
                                        int valor = sc.nextInt();

                                        // Cria uma variável booleana para indicar se existe ou não dois números que somados são iguais ao valor informado
                                        boolean existe = false;

                                        // Percorre todos os elementos do vetor
                                        for (int i = 0; i < TAM; i++) {
                                            // Percorre todos os elementos do vetor a partir do próximo elemento de i
                                            for (int j = i + 1; j < TAM; j++) {
                                                // Se a soma dos elementos i e j do vetor for igual ao valor informado pelo usuário
                                                if ( vetor[i] + vetor[j] == valor ) {
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

                                        // Verifica o valor da variável booleana e imprime uma mensagem adequada
                                        if ( existe ) {
                                            System.out.println("Existe dois números no vetor que somados são iguais a " + valor);
                                        } else {
                                            System.out.println("Não existe dois números no vetor que somados são iguais a " + valor);
                                        }
                                        break;
                                    case 0:
                                        // sair do programa
                                        break;

                                    default:
                                }
                        }
                        System.out.println("Opção Invalida.");
                    }

            }
        } while (option != 0);

    }// fin do main
}// fim da class
