import java.util.Arrays;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*

beecrowd | 2381
Lista de Chamada
 */
public class ListaDeChamada{
    public static void main (String[] args) throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String entrada[] = in.readLine().split(" ");
        int N = Integer.parseInt(entrada[0]);
        int K = Integer.parseInt(entrada[1]);

        String alunos[] = new String[N];
        for(int i = 0; i < N; ++i){
            alunos[i] = in.readLine();
        }

        Arrays.sort(alunos);

        System.out.printf("%s\n", alunos[K - 1]);
    }
}