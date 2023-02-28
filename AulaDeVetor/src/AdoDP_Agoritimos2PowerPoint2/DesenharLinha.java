package AdoDP_Agoritimos2PowerPoint2;


import java.util.Scanner;

public class DesenharLinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caractere que deseja usar para desenhar a linha: ");
        String caractere = sc.nextLine();
        String linha = "";
        for (int i = 0; i < 100; i++) {
            linha += caractere;
        }
        System.out.println(linha);
    }
}