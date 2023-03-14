package MenuComVetor;

import java.util.Scanner;
/*
Entrega a Atividade 3 - Algoritmos e Programação II
Autor Nome completo :Genivaldo Alves Dos Anjos :  declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/
public class Ex3_NumeroContidoNoVetor {
    public static int verificarValor(int[] vetor, int valor) {
        // percorre o vetor
        for (int i = 0; i < vetor.length; i++) {
            // compara o elemento com o valor
            if (vetor[i] == valor) {
                // retorna o índice
                return i;
            }
        }
        // retorna -1 se não encontrar
        return -1;
    }

    public static void main(String[] args) {
        // cria o vetor
        int[] vetor = {10, 20, 30, 40, 50};
        // cria o objeto Scanner
        Scanner sc = new Scanner(System.in);
        // solicita o valor ao usuário
        System.out.println("Digite um valor a ser procurado no vetor:");
        int valor = sc.nextInt();
        // chama o método verificarValor
        int indice = verificarValor(vetor, valor);
        // verifica o resultado
        if (indice == -1) {
            // imprime que não encontrou
            System.out.println("O valor não está contido no vetor.");
        } else {
            // imprime o índice
            System.out.println("O valor está contido no vetor na posição " + indice + ".");
        }
        // fecha o Scanner
        sc.close();
    }
}