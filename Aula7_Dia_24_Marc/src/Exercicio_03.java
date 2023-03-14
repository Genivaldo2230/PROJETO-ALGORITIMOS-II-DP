public class Exercicio_03 {
    public static void main(String[] args) {
        int[] v = {2, 8, 1, 3, 7, 6};
        int d = difrencaAbsoluta(v);
        System.out.println("Diferença Absolutar "+d);
    }
    public static int difrencaAbsoluta(int[] v){
        int menor = v[0];
        int maior = v[0];
        for(int i = 1; i< v.length; i++){
            if(v[i]<menor){
                menor = v[i];
            }
            if(v[i]>maior){

            }
            return maior = menor;
        }

        return menor;
    }

}
