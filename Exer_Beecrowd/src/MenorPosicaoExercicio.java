/* QUEST�O Fa�a um programa que leia um valor N. Este N ser� o tamanho de um vetor X[N].
 A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor
 e a sua posi��o dentro do vetor, mostrando esta informa��o.
  ENTRADA
 A primeira linha de entrada contem um �nico inteiro N (1 < N < 1000), indicando
 o n�mero de elementos que dever�o ser lidos em seguida para o vetor X[N] de
 inteiros. A segunda linha cont�m cada um dos N valores, separados por um espa�o.
  SA�DA
 A primeira linha apresenta a mensagem �Menor valor:� seguida de um espa�o e do
 menor valor lido na entrada. A segunda linha apresenta a mensagem �Posicao:�
 seguido de um espa�o e da posi��o do vetor na qual se encontra o menor valor
 lido, lembrando que o vetor inicia na posi��o zero.
 */
public class MenorPosicaoExercicio {
    public static void main(String[] args) throws Exception {

        int menor = 0, posMenor = 0;

        int[] vetor = {1, 2, 3, 4, 5, -6, 7, 8, 9, 10};

        for (int i = 0; i < vetor.length; i++) {

            System.out.println(" Vetor De Nº = " + " [ " + vetor[i] + " ] " + " Indice Valor = " + i);
        }
        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                menor = vetor[i];
                posMenor = i;
            } else if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posMenor);

    }

}