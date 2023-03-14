package MenuComVetor;

import java.util.Arrays;
/*
Entrega a Atividade 8 - Algoritmos e Programação II
Autor Nome completo :Genivaldo Alves Dos Anjos :  declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/
public class Ex8_SomadosValorInformado {

    // Função que recebe um vetor e um valor como parâmetros
    public static boolean existeSoma(int[] vetor, int valor) {
        // Ordena o vetor em ordem crescente
        Arrays.sort(vetor);
        // Define dois ponteiros para o início e o fim do vetor
        int inicio = 0;
        int fim = vetor.length - 1;
        // Enquanto os ponteiros não se cruzarem
        while (inicio < fim) {
            // Calcula a soma dos elementos nas posições apontadas
            int soma = vetor[inicio] + vetor[fim];
            // Se a soma for igual ao valor, retorna true
            if (soma == valor) {
                return true;
            }
            // Se a soma for menor que o valor, incrementa o ponteiro do início
            else if (soma < valor) {
                inicio++;
            }
            // Se a soma for maior que o valor, decrementa o ponteiro do fim
            else {
                fim--;
            }
        }
        // Se não encontrar nenhum par que satisfaça a condição, retorna false
        return false;
    }

}
