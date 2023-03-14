import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = gerarVetor();

      //  Arrays.sort(vetor, Collections.reverseOrder() );
        System.out.println(Arrays.toString(vetor));
        System.out.println(" Numero : ");
        int n = sc.nextInt();
        int posicao = buscaBinaria(vetor,n);
        if(posicao >= 0){
            System.out.println("Valor encontrado" + posicao);
        }
        else {
            System.out.println(" Valor não Encontrado");
        }
    }

    public static int buscaBinaria(int[] v, int x){
        int inicio = 0;
        int fim = 0;
        int meio = 0;
        while (inicio <= fim){
            meio = (inicio + fim) / 2;
            if(x == v[meio])
                return meio;
            if(x < meio)
                fim = meio -1;
            else
                inicio = meio +1;
        }
        return -1;
    }

    public static int[] gerarVetor() {
        Random rd = new Random();
        int[] vetor = new int[100];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(1000);
        } return vetor;
    }

}
