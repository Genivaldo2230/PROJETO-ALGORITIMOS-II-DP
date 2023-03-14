/*
Entrega a Atividade 4 - Algoritmos e Programação II
Autor Nome completo :Genivaldo Alves Dos Anjos :  declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/
public class Ex4_MaiorNumeroNoVetor {


    // Função que recebe um vetor de números e retorna o maior elemento
    public static int maiorNumero(int[] vetor) {
        // Inicializa o maior elemento com o primeiro valor do vetor
        int maior = vetor[0];
        // Percorre o vetor a partir do segundo elemento
        for (int i = 1; i < vetor.length; i++) {
            // Se o elemento atual for maior que o maior, atualiza o maior
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        // Retorna o maior elemento encontrado
        return maior;
    }

    // Programa principal
    public static void main(String[] args) {
        // Cria um vetor de números
        int[] vetor = {10, 5, 8, 12, 3, 7};
        // Chama a função que busca o maior número e armazena o resultado
        int maior = maiorNumero(vetor);
        // Imprime o resultado
        System.out.println("O maior número do vetor é: " + maior);
    }
}
