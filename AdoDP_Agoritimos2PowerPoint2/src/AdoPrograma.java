
import java.util.Random;
import java.util.Scanner;



public class AdoPrograma {


            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = null;
            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Inicializar o vetor com números aleatórios");
                System.out.println("2. Imprimir o vetor");
                System.out.println("3. Verificar se um determinado número está contido no vetor");
                System.out.println("4. Buscar o maior número armazenado no vetor");
                System.out.println("5. Calcular a média dos números pares armazenados no vetor");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.print("Digite o tamanho do vetor: ");
                    int size = scanner.nextInt();
                    array = new int[size];
                    System.out.print("Digite M: ");
                    int m = scanner.nextInt();
                    Random random = new Random();
                    for (int i = 0; i < size; i++) {
                        array[i] = random.nextInt(m + 1);
                    }
                } else if (option == 2) {
                    printArray(array);
                } else if (option == 3) {
                    System.out.print("Digite o valor a ser procurado: ");
                    int value = scanner.nextInt();
                    int index = findValue(array, value);
                    if (index != -1) {
                        System.out.println(value + " foi encontrado na posição " + index);
                    } else {
                        System.out.println(value + " não foi encontrado.");
                    }
                } else if (option == 4) {
                    if (option == 1) {
                        System.out.print("Digite o tamanho do vetor: ");
                        int size = scanner.nextInt();
                        array = new int[size];
                        System.out.print("Digite M: ");
                        int m = scanner.nextInt();
                        Random random = new Random();
                        for (int i = 0; i < size; i++) {
                            array[i] = random.nextInt(m + 1);
                            System.out.println("Obrigado por usar o menu do console. Até mais!");
                            scanner.close();
                            return;
                        }
                    }
                }
            }
}

    private static int findValue(int[] array, int value) {
        return 0;
    }

    private static void printArray() {
        printArray(null);
    }

    private static void printArray(int[] array) {
    }}
