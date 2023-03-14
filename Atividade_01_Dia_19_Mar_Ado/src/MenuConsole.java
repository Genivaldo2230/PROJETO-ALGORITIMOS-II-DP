import java.util.Random;
import java.util.Scanner;

public class MenuConsole {
    public static Ex1_InicializarVetorAleatorio main() {



        //menu1 = new Ex1_InicializarVetorAleatorio();

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);


        //Estanciando as Classe
        Ex1_InicializarVetorAleatorio menu1 = new Ex1_InicializarVetorAleatorio();
        Ex2_ImprimirOvetor menu2 = new Ex2_ImprimirOvetor();

        // Cria um array de strings para armazenar as opções do menu
        String[] opcoes = {"1. Inicializar Vertor Aleatorio", "2. Imprimir o Vetor", "3. Número Contido no Vetor", "4. Maior Número do Vetor", "5. Calcular Média Números Pares", "6. Calacular Porcentual Número Impares Armazenado Vetor ", "7. Calcular Media Centralizada do Vetor ", "8. Somando Valor Informado", "9. Sair"};

        // Cria um loop infinito para imprimir o menu até que o usuário escolha sair
        while (true) {
            // Imprime o menu
            System.out.println("Escolha uma opção:");
            for (String opcao : opcoes) {
                System.out.println(opcao);
            }

            // Lê a opção do usuário
            int escolha = sc.nextInt();


            //Random rd = new Random();
            int executar =9;
            int[]vetor = new int[executar];
            for(int i=0; i < executar;i++){

                int random = new Random().nextInt(9);
                executar = random;
            }

            // Usa uma instrução switch para identificar a opção que o usuário quer executar
            switch (escolha) {
                case 1:
                    // Chama o método
                    executar(sc);

                    menu1 = main();

               break;


                case 2:
                    // Chama o método
                    executar(sc);
                   break;
                case 3:
                    // Chama o método
                    executar(sc);
                    break;
                case 4:
                    // Chama o método
                    executar(sc);
                    break;

                case 5:
                    // Chama o método
                    executar(sc);
                    break;
                case 6:
                    // Chama o método
                    executar(sc);
                    break;

                case 7:
                    // Chama o método
                    executar(sc);
                    break;

                case 8:
                    // Chama o método
                    executar(sc);
                    break;

                case 9:
                    // Sai do loop e encerra o programa
                    System.out.println("Obrigado por usar o menu do console. Até mais!");
                    sc.close();
                    return menu1;
                default:
                    // Imprime uma mensagem de erro se a opção for inválida
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static Ex1_InicializarVetorAleatorio menu1() {
        return null;
    }


    private static void executar(Scanner sc) {
    }

   }