import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColunaNaMatriz {
    /*

1182 - Coluna na Matriz
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int C = Integer.parseInt(in.readLine());
        String T = in.readLine();

        double soma = 0.0;
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                double numero = Double.parseDouble(in.readLine());

                if (j == C) {
                    soma += numero;
                }
            }
        }

        if (T.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else {
            System.out.printf("%.1f\n", soma / 12.0);
        }
    }
}