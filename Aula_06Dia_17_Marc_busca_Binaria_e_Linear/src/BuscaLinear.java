import java.util.Random;
import java.util.Scanner;

public class BuscaLinear {

    public static int buscaBinaria(int v[], int x) {
        int inicio, meio, fim;
        inicio = 0;
        fim = v.length - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (x < v[meio])//esquerda
                fim = meio - 1;
            else //x>v[meio]-direita
                inicio = meio + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random(100);

        System.out.println("Digite um Numero de Busca ");
        int num1 = 0;
        sc.nextInt();

        int num2 = rd.nextInt(100);
        System.out.println(rd.nextInt());

        for(int i =0; i<=num1; i++){

            System.out.println(nun2);

        }
    }
}