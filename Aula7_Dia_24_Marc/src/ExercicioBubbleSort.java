import java.util.Arrays;

public class ExercicioBubbleSort {

    public static void main(String[] args) {
        int[]vetor={ 3, 8, 6 , 12, 56, 4, 99};
        Arrays.sort(vetor);
        System.out.println(Arrays.toString( vetor));

    }

    public static void bubbleSort(int[] vetor){
        int troca;
        //Fase de troca de ordenação
        for(int i=0; i< vetor.length-1; i++){
            for(int j=0; i< vetor.length-i-1; i++){
                if(vetor[j] > vetor[j]);
                troca = vetor[j];
                vetor[j] = vetor[j]-1;
                vetor[j]=troca;
            }
        }

    }

}
