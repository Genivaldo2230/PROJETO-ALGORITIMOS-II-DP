/*
6. Calcular o percentual dos números ímpares armazenados no vetor;
Calcular o percentual dos números ímpares armazenados no vetor: Nessa operação o seu programa não solicita nada ao
 usuário, somente chama a função que recebe por parâmetro o vetor de números, a função calcula e retorna o percentual
  de números ímpares armazenados no vetor, no programa principal é impresso o percentual calculado.
 */
public class Ex6_CalcularPercentualNumerosImparesArmazVetor {
    public static double percentualImpares(int[] vetor) {
        int impares = 0; // variável para contar os números ímpares
        for (int i = 0; i < vetor.length; i++) { // laço para percorrer o vetor
            if (vetor[i] % 2 != 0) { // se o número é ímpar
                impares++; // incrementa o contador
            }
        }
        return (double) impares / vetor.length * 100; // retorna o percentual
    }
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // vetor de números
        double percentual = percentualImpares(vetor); // chama a função
        System.out.println("O percentual de números ímpares no vetor é " + percentual + "%"); // imprime o resultado
    }


}
