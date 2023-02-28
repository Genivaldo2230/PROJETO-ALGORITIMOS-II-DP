package Atividade01_Date19_03;

import java.util.Scanner;

/*
Para o usuário escolher as operações, o seu programa deverá mostrar um **menu de opções.** Cada opção do menu
deve executar a operação correspondente, além disso, o programa deverá executar até o momento que usuário solicite finalizar
 o programa, ou seja, o usuário pode escolher outras operações do **menu de opção** várias vezes, após ser executada a operação o menu de
  opções é apresentado novamente. A seguir são descritas detalhadamente cada uma das operações:
 */
public class Menu {


    public static void main(String[] args) {
        Ex1_InicializarVetorAleatorio menu_1 = new Ex1_InicializarVetorAleatorio();
        Ex2_ImprimirOvetor menu_2 = new Ex2_ImprimirOvetor();
        Ex3_NumeroContidoNoVetor menu_3 = new Ex3_NumeroContidoNoVetor();
        Ex4_MaiorNumeroNoVetor menu_4 = new Ex4_MaiorNumeroNoVetor();
        Ex5_Calcular_Media_NumerosPares_Vetor menu_5 = new Ex5_Calcular_Media_NumerosPares_Vetor();
        Ex6_CalcularPercentualNumerosImparesArmazVetor menu_6 = new Ex6_CalcularPercentualNumerosImparesArmazVetor();
        Ex7_CalculaMediaCentralizadaVetor menu_7 = new Ex7_CalculaMediaCentralizadaVetor();
        Ex8_SomadosValorInformado menu_8 = new Ex8_SomadosValorInformado();


        Scanner sc = new Scanner(System.in);

        String sair;
        sair= sc.nextLine();

        int menu = 0;
        System.out.println("Escolha seu Numero no Menu : " + menu);
        menu = sc.nextInt();


        switch (menu) {
            case '1':
                System.out.println("Menu Escolhido " + menu_1);
                menu_1 = new Ex1_InicializarVetorAleatorio();
                System.out.println(args[menu]); /* Imprime o valor da posição i do vetor */

            case '2':
                System.out.println("Menu Escolhido " + menu_2);

            case '3':
                System.out.println("Menu Escolhido " + menu_3);

            case '4':
                System.out.println("Menu Escolhido " + menu_4);

            case '5':
                System.out.println("Menu Escolhido " + menu_5);
            case '6':
                System.out.println("Menu Escolhido " + menu_6);

            case '7':
                System.out.println("Menu Escolhido " + menu_7);

            case '8':
                System.out.println("Menu Escolhido " + menu_8);


        }
        System.out.println("Escolha seu Numero no Menu " + menu);
        sc.close();
    }
}