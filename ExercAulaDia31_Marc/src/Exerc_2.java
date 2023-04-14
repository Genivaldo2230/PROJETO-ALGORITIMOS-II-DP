import java.util.Arrays;

public class Exerc_2 {
    public static void main(String[] args) {
        int []vetor = {2,5,8,9,6,3,1,4,7};
        selectionSort(vetor);
        System.out.println(Arrays.toString(vetor));
    }
    public static void selectionSort(int[]vetor){
        int menor , aux;
        for(int i = 0; i< vetor.length-1; i++){
            menor = i;
            for(int j = 1; j< vetor.length; j++){
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor]=aux;
        }
    }
}
