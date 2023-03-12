import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  nota1, nota2;
        double media = 0;
        String continua = "s";

        while (continua.equals("s")){
            System.out.println("Digite sua Primeira Nota :");
            nota1 = sc.nextDouble();
            System.out.println("Digite suaSegunda Nota :");
            nota2 = sc.nextDouble();

            //calculando a media
            media =(nota1 + nota2) / media;
            if(media >=6) {
                System.out.println("Aprovado coma media " + media);
            }else {
                System.out.println("Reprovado  com a média "+ media);
            }
            System.out.println("Deseja calcular uma nova média ? (s/n): ");
            continua = sc.next();
        }
    }
}
