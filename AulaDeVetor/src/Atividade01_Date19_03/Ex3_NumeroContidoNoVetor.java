package Atividade01_Date19_03;

import java.util.Scanner;

/*
3. Verificar se um determinado número está contido no vetor;
Verificar se um determinado número está contido no vetor: Nessa operação o seu programa solicita que o usuário informe
um valor a ser procurado no vetor, em seguida é chamada a função correspondente a essa operação, a função recebe por parâmetro
o vetor e o valor a ser procurado, caso o valor esteja no vetor sua função retorna o índice onde foi encontrado o valor, e caso
contrário sua função retorna -1, por fim, fora da função, o seu programa imprime uma mensagem informando se o valor foi ou não encontrado.
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