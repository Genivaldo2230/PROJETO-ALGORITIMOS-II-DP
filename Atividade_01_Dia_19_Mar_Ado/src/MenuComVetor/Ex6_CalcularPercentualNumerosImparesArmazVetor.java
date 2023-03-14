package MenuComVetor;

/*
Entrega a Atividade 6- Algoritmos e Programação II
Autor Nome completo :Genivaldo Alves Dos Anjos :  declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
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
