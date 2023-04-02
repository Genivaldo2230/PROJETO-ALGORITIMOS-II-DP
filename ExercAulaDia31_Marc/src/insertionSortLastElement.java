import java.util.Arrays;

public class insertionSortLastElement {


    public static void main(String[] args) {
        int[] vetor = {3,5,9,11,15,17,19,6};
        System.out.println("Vetor Antes de orednar " + Arrays.toString(vetor));
        insertionSortLastElement(vetor);
        System.out.println("Vetor depois de Ordena " + Arrays.toString(vetor));

    }
//chamamos a função insertionSortLastElement e passamos o vetor  como argumento.
// Depois que a função é executada, o vetor e ele troca pelo seu anterior é reordenado e o último elemento é movido para a posição correta.
    //instruçãde vetor faz a troca do ultimo numero pelo primeiro numero
    public static void  insertionSortLastElement(int[] vetor){
        int n = vetor.length;
        int lastElement = vetor[n-1];
        int j = n-2;
        while (j >= 0 && vetor[j] > lastElement){
            vetor[j+1] = vetor[j];
            j--;
        }
        vetor[j+1] =  lastElement;
    }
}