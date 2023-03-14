import java.io.IOException;

import java.util.Scanner;
/*
beecrowd | 1174
Seleçao em Vetor I
 */
public class SelecaoDeVetorI {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; ++i) {
            double n = Double.parseDouble(sc.nextLine());

            if (n <= 10.0) {
                System.out.printf("A[%d] = %.1f\n", i, n);
            }
        }
    }
}
