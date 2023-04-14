/*
Considere um vetor com Numeros pares e Impares , reescreva o Metodo de Ordenação por inserção para colocar
todosos numeros pares a frente do mesmo vetor eos impares ao final no mesmo vetor.
Você na pode usar outro vetrocomo área auxiliar.
 */
public class InsertionSortParImpar {
    public static void main(String[] args) {
        int []vet = {5,2,3,9,6,7,4,1,0};
        InsertionSort(vet);
        imprimir(vet);

    }
    public static void InsertionSort(int[] vet){
        for(int i =0; i <vet.length; i++){
            int j= i;
            int x= vet[j];
            while (j > 0 && ehPar(x) && !ehPar(vet[j -1])){
                vet[j] = vet[ j -1];
                j--;
            }
            vet[j] = x;
        }
    }
    public static boolean ehPar(int n){
        return n%2 == 0;
    }
    public static void imprimir(int [] vet){
        for(int i = 0; i< vet.length; i++) {
            System.out.println("Numero São " +vet[i] + " ");
        }
        System.out.println();

        }
    }