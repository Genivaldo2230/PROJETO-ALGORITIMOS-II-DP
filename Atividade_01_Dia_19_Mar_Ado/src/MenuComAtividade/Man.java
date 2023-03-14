package MenuComAtividade;


import java.util.Random;
import java.util.Scanner;

public class Man {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean sair = false;
        while (!sair) {
            System.out.println("Menu:");
            System.out.println("1. Inicializar o vetor com números aleatórios");
            System.out.println("2. Imprimir o vetor");
            System.out.println("3. Verificar se um determinado número está contido no vetor");
            System.out.println("4. Buscar o maior número armazenado no vetor");
            System.out.println("5. Calcular a média dos números pares armazenados no vetor");
            System.out.println("6. Calcular o percentual dos números ímpares armazenados no vetor");
            System.out.println("7. Calcula a média centralizada dos números armazenados no vetor");
            System.out.println("8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.");
            System.out.println("9. Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    for (int i = 0; i < vetor.length; i++) {
                        vetor[i] = rand.nextInt(100);
                    }
                    break;
                case 2:
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print(vetor[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Digite o número que deseja verificar: ");
                    int num = scanner.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < vetor.length; i++) {
                        if ( vetor[i] == num ) {
                            encontrado = true;
                            break;
                        }
                    }
                    if ( encontrado ) {
                        System.out.println(num + " está contido no vetor.");
                    } else {
                        System.out.println(num + " não está contido no vetor.");
                    }
                    break;
                case 4:
                    int maior = vetor[0];
                    for (int i = 1; i < vetor.length; i++) {
                        if ( vetor[i] > maior ) {
                            maior = vetor[i];
                        }
                    }
                    System.out.println("O maior número armazenado no vetor é: " + maior);
                    break;
                case 5:
                    int somaPares = 0;
                    int qtdPares = 0;
                    for (int i = 0; i < vetor.length; i++) {
                        if ( vetor[i] % 2 == 0 ) {
                            somaPares += vetor[i];
                            qtdPares++;
                        }
                    }
                    double mediaPares = (double) somaPares / qtdPares;
                    System.out.println("A média dos números pares armazenados no vetor é: " + mediaPares);
                    break;
                case 6:
                    int qtdImpares = 0;
                    for (int i = 0; i < vetor.length; i++) {
                        if ( vetor[i] % 2 != 0 ) {
                            qtdImpares++;
                        }
                    }
                    double percentualImpares = (double) qtdImpares / vetor.length * 100;
                    System.out.println("O percentual dos números ímpares armazenados no vetor é: " + percentualImpares + "%");
                    break;
                case 7:
                    double mediaCentralizada = 0;
                    double somaCentralizada = 0;
                    for (int i = 1; i < vetor.length - 1; i++) {
                        somaCentralizada += vetor[i];
                    }
                    mediaCentralizada = somaCentralizada / (vetor.length - 2);
                    System.out.println("A média centralizada dos números armazenados no vetor é: " + mediaCentralizada);
                    break;
                case 8:
                    boolean existe = false;
                    int valor = scanner.nextInt();
                    for (int i = 0; i < vetor.length; i++) {
                        for (int j = i + 1; j < vetor.length; j++) {
                            if ( vetor[i] + vetor[j] == valor ) {
                                existe = true;
                                break;
                            }
                        }

                        if ( existe ) {
                            break;
                        }
                    }
                    if ( existe ) {
                        System.out.println("Existem");
                    }
            }
        }
    }
}