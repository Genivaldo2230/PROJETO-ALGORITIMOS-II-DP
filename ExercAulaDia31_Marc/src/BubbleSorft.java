import java.util.Arrays;
public class BubbleSorft {
        public static void main(String[] args) {
            int[] v = {4, 8, 9, 3, 5, 1, 2, 6, 7};
            bubbleSort(v);
            System.out.println(Arrays.toString(v));
        }

        public static void bubbleSort(int[] v) {
            int aux;
            for (int i = 0; i < v.length - 1; i++) {
                for (int j = 0; j < v.length - 1 - i; j++) {
                    if (!ehPar(v[j]) && ehPar(v[j+1])) {
                        aux = v[j];
                        v[j] = v[j+1];
                        v[j+1] = aux;
                    }
                }
            }
        }

        public static boolean ehPar(int n) {
            return n % 2 == 0;
        }
    }

