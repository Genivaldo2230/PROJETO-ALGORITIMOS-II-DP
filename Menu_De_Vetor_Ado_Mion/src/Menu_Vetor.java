import java.util.Random;
import java.util.Scanner;
/*
Entrega a Atividade 1 - Algoritmos e Programação II

Nome completo:Genivaldo Alves Dos Anjos
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/
public class Menu_Vetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int option;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("==========================================================================");
            System.out.println("1. Inicializar o vetor com numeros aleateatorios");
            System.out.println("==========================================================================");
            System.out.println("2. Imprimir o vetor");
            System.out.println("==========================================================================");
            System.out.println("3. Verificar se um determinado nC:numeros estC! contido no vetor");
            System.out.println("==========================================================================");
            System.out.println("4. Buscar o maior numeros armazenado no vetor");
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
                    // Inicializar o vetor com números aleatórios
                    for (i = 0; i < vetor.length; i++) {
                        vetor[i] = random.nextInt(100);
                    }
                    break;

                case 2:
                    // Imprimir o vetor
                    System.out.print("Vetor: ");
                    for (i = 0; i < vetor.length; i++) {
                        System.out.print(vetor[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    // Verificar se um determinado número está contido no vetor
                    int numeroProcurado = 50;
                    boolean encontrado = false;
                    for (i = 0; i < vetor.length; i++) {
                        if (vetor[i] == numeroProcurado) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("O número " + numeroProcurado + " está contido no vetor.");
                    } else {
                        System.out.println("O número " + numeroProcurado + " não está contido no vetor.");
                    }
                    break;
                case 4:
                    // Buscar o maior número armazenado no vetor
                    int maiorNumero = vetor[0];
                    for (i = 1; i < vetor.length; i++) {
                        if (vetor[i] > maiorNumero) {
                            maiorNumero = vetor[i];
                        }
                    }
                    System.out.println("O maior número armazenado no vetor é: " + maiorNumero);

                    break;
                case 5:

                    // Calcular a média dos números pares armazenados no vetor
                    int somaPares = 0;
                    int quantidadePares = 0;
                    for (i = 0; i < vetor.length; i++) {
                        if (vetor[i] % 2 == 0) {
                            somaPares += vetor[i];
                            quantidadePares++;
                        }
                    }
                    double mediaPares = (double) somaPares / quantidadePares;
                    System.out.println("A média dos números pares armazenados no vetor é: " + mediaPares);
                    break;
                case 6:
                    // Calcular o percentual dos números ímpares armazenados no vetor
                    int quantidadeImpares = 0;
                    for (i = 0; i < vetor.length; i++) {
                        if (vetor[i] % 2 != 0) {
                            quantidadeImpares++;
                        }
                    }
                    double percentualImpares = (double) quantidadeImpares / vetor.length * 100;
                    System.out.println("O percentual dos números ímpares armazenados no vetor é: " + percentualImpares + "%");
                    break;
                case 7:
                    int soma = 0;
                    for (i = 0; i < vetor.length; i++) {
                        soma += vetor[i];
                    }
                    double mediaCentralizada = (double) soma / vetor.length;
                    System.out.println("A média centralizada dos números armazenados no vetor é: " + mediaCentralizada);
                    break;
                case 8:
                    int valorProcurado = 100;
                    encontrado = false;
                    for ( i = 0; i < vetor.length; i++) {
                        for (int j = i + 1; j < vetor.length; j++) {
                            if (vetor[i] + vetor[j] == valorProcurado) {
                                encontrado = true;
                                break;
                            }
                        }
                        if (encontrado) {
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Existem dois números em posições distintas que somados são iguais a " + valorProcurado + ".");
                    } else {
                        System.out.println("Não existem dois números em posições distintas que somados são iguais a " + valorProcurado + ".");
                    }
                    break;

                case 0:
                    // sair do programa*/
                default:

            }

        } while (option != 0);
    }
}