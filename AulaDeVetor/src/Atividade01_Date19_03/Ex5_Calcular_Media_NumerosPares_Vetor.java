package Atividade01_Date19_03;
/*
5. Calcular a média dos números pares armazenados no vetor;
Calcular a média dos números pares armazenados no vetor: Nessa operação o seu programa não solicita nada ao usuário,
somente chama a função que recebe por parâmetro o vetor de números, a função calcula e retorna a média dos números pares a
rmazenados no vetor, no programa principal é impresso a média calculada.
 */
public class Ex5_Calcular_Media_NumerosPares_Vetor {


    // Função que recebe um vetor de números e retorna a média dos números pares
    public static double mediaPares(int[] vetor) {
        // Variáveis para armazenar a soma e a contagem dos números pares
        int soma = 0;
        int cont = 0;
        // Percorrer o vetor e verificar se cada elemento é par
        for (int num : vetor) {
            // Se for par, somar e incrementar a contagem
            if (num % 2 == 0) {
                soma += num;
                cont++;
            }
        }
        // Se a contagem for maior que zero, calcular e retornar a média
        if (cont > 0) {
            return (double) soma / cont;
        }
        // Se não houver números pares, retornar zero
        else {
            return 0;
        }
    }

    // Programa principal que cria um vetor de números e imprime a média dos números pares
    public static void main(String[] args) {
        // Criar um vetor de números
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Chamar a função que calcula a média dos números pares e armazenar o resultado
        double media = mediaPares(vetor);
        // Imprimir a média
        System.out.println("A média dos números pares é: " + media);
    }
}
