package Aula03_24_02_Matrizes;

/* Repita o Exercicio Anterios , AGORA DEVER SER RETORNADO EM UMA STRING os elementos
que estão em A[] mas não estão em B[], ou seja a DIFERENÇA de A - B.
EXEMPLOS : A[] = {7,2,5,8,4} e B[] ={4,2,9,5} então A!=B ={ 7, 8 }
 *           A[] = {3,9,11 } e B[] ={ 2, 6, 1 } então A!=B = { 3,9,11  }
* */
public class Exercicios02Diferenca {
    public static void main(String[] args) {
        int[] v1 = {7, 2, 5, 8, 4};
        int[] v2 = {4, 2, 9, 5};
        String res = diferenca(v1, v2);
        System.out.println(res);
    }

    public static String diferenca(int[] a, int[] b) {
        String resultado = "";
        boolean achou;
        for (int i = 0; i < a.length; i++) {
            achou = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                resultado += a[i] + " ";
            }
        }
        return resultado;
    }
}