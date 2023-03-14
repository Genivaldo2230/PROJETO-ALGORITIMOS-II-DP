public class Exercicio4 {

    public static void main(String[] args) {
        int[] v = {5, 10, 3, 2, 4, 7, 9, 8, 9};
        System.out.println("Comprimento do Vetor = "+comprimento(v));

    }

    public static int comprimento(int[] vetor) {

        int[] v = {5, 10, 3, 2, 4, 7, 9, 8, 9};
        int comprimento = 1;
        int cont = 1;

        for (int i = 0; i < v.length - 1; i++) {
            if ( vetor[i] < vetor[i + 1] ) ;
            cont++;
        }
        if ( cont <= comprimento ) ;
        else {

            comprimento = cont;
        }
        cont = 1;
        return comprimento;
    }
}

