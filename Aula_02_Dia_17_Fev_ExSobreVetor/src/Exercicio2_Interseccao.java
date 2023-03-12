/*Escreva uma função que receber dosi vetores inteiros  A[] e B[],
 * Em seguida a sua função efetua a intersecção entre os vetores, ou seja os elementos em comum entre os dois vetores ao final da sua função retorna uma STRING com a resposta
 * os vetores dados nao possuem valores duplicados e nao estão oredenados
 * EXEMPLOS : A[] = {7,2,5,8,4} e B[] ={4,2,9,5} então A!=B ={2,5,4}
 *           A[] = {3,9,11 e B[] ={2,6,1} então A!=B = {  }
 * */
public class Exercicio2_Interseccao  {

    public static void main(String[] args) {
        int[] v1 = {7, 2, 5, 8, 4};
        int[] v2 = {4, 2, 9, 5};
        String res = interseccao(v1, v2);
        System.out.println(res);
    }

    public static String interseccao(int[] a, int[] b) {
        String resultado = "";
        // percorre o vetor A
        for (int i = 0; i < a.length; i++) {
            // percorre o vetor B
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    resultado = resultado + a[i] + " ";
                    break;
                }
            }
        }
        return resultado;
    }
}
