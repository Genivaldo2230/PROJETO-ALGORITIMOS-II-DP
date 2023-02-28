package AdoDP_Agoritimos2PowerPoint2;

public class Tabuada {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caractere que deseja usar para desenhar a linha: ");
        //String caractere = sc.nextLine();
        String linha = "****" ;
        for (int i = 0; i < 5; i++) {
            String caractere = "**";
            linha += caractere;
        }


        int i = 2;
        while (i <= 9) {

            System.out.println(linha + "\nTabuada do " + i + " : ");
            int j = 1;
            System.out.println(linha );
            while (j <= 10) {

                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            i++;
        }

    }
}
