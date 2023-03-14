
import java.io.IOException;

import java.util.Scanner;

/*
1190 - Área Direita
 */
public class AreaDireita {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);

        String O = sc.nextLine().trim();

        int contador = 0;
        double soma = 0.0;
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                double numero = Double.parseDouble(sc.nextLine());

                if ((i < 6 && j > 11 - i) || (i > 5 && j > i)) {
                    soma += numero;
                    ++contador;
                }
            }
        }

        System.out.printf("%.1f\n", O.equals("S") ? soma : soma / contador);
    }
}