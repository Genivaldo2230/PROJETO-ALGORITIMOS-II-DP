/*
Entrega a Atividade 7 - Algoritmos e Programação II
Autor Nome completo :Genivaldo Alves Dos Anjos :  declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/
public class Ex7_CalculaMediaCentralizadaVetor {

    // Função que recebe um vetor de números e retorna a média centralizada
    public static double mediaCentralizada(double[] vetor) {
        // Variáveis para armazenar o menor, o maior e a soma dos elementos
        double menor = vetor[0];
        double maior = vetor[0];
        double soma = 0;
        // Laço para encontrar o menor e o maior valor no vetor
        for (double num : vetor) {
            if (num < menor) {
                menor = num;
            }
            if (num > maior) {
                maior = num;
            }
        }
        // Laço para somar todos os elementos, exceto o menor e o maior usando for-each
        for (double num : vetor) {
            if (num != menor && num != maior) {
                soma += num;
            }
        }
        // Cálculo da média centralizada
        double media = soma / (vetor.length - 2);
        // Retorno da média centralizada
        return media;
    }

    // Programa principal que chama a função e imprime o resultado
    public static void main(String[] args) {
        // Vetor de números
        double[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // Chamada da função e armazenamento do resultado
        double media = mediaCentralizada(vetor);
        // Impressão do resultado
        System.out.println("A média centralizada do vetor é: " + media);
    }
}
