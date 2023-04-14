import java.util.Arrays;

public class OrdenaUltimo {
    public static void main(String[] args) {
        int []v= {3,5,9,11,15,17,19,6};
        OrdenaUltimo(v);
        System.out.println(Arrays.toString(v));
    }
    public static void OrdenaUltimo (int []v){
        int k = v.length-1;
        int x = v[k];
        while (k > 0 && x < v[k-1]){
            v[k] = v[k-1];
            k--;
        }
        v[k] = x;
    }
}
