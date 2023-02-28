package Atividade01_Date19_03;

import java.util.Arrays;
/* 8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.Verificar se, dado um valor, existe dois números em posições distintas que somados é igual ao valor informado por parâmetro:
 Nessa operação deve ser implementada uma função que recebe como parâmetro o vetor e um valor. A função verifica se existe no vetor dois números em posições distintas no vetor que somados tem como resultado o valor informado por parâmetro à função.
  Caso exista esses dois números no vetor a função retorna true e false caso contrário. */
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
