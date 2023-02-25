package AulaAlgoritimosSegunda;

import java.util.Scanner;

/*
* 2-)Crie um programa que pergunte ao usuário qual carro ele deseja comprar, o Carro 1 ou o Carro 2.
 Carro 1 custa R$ 100.000,00
 Carro 2 custa R$ 150.000,00
 Carro será vendido da seguinte forma,entrada de 40% e o restante  dividido em 12 meses sem juros.O programa deverá exibir:
 a) o valor da entrada
 b) o valor que será cobrado por parcela
 c) e o número total de parcelas.
* */
public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite Valor do Veiculo Carro 1 " + "R$ : ");//Entrada do valor do veiculo integral usando  R$ .
        float carro = 0;
        carro = sc.nextFloat();
        float valor1 = 0;
        float pocentual = (float) (40.0 / 100.0);// entrada baseada no indeice 40% redução do valor integral ficando saldo a ser financiado

        float valor = carro - (pocentual * (float) carro);
        pocentual = valor1 + (carro * pocentual );
        System.out.println("\nValor de Entrada  R$ = " + pocentual +" Real");

        System.out.printf("\nValores A ser Financiados   R$  = %.2f Real", valor);// saida valor a ser financiado



        System.out.print("\n\nDIGITE NUMEROS DE PARCELAS Nº:  "); // entrada de numero de parcelas

        int parcelas;
        parcelas = sc.nextInt();
        if (parcelas == valor) {
            parcelas = (int) (valor - (pocentual * carro));
        }
        //  System.out.printf("%.2f " ,valor / parcelas);
        System.out.printf("\nValores da Parecelas R$ = %.2f", valor / parcelas );// saida do valor a ser pago por mes

        System.out.print("\n\nValores da Divida  R$ = "+valor +" Quantidade de parcelas "+ parcelas );// saida do valor a ser pago por mes

    }
}