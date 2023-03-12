import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s" ;
        while (continuar.equals("s")) {
            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            System.out.println("Escolha a operação (+, -, *, /): ");
            String operacao = scanner.next();
            int resultado;
            switch (operacao) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    continue;
            }
            System.out.println("Resultado: " + resultado);
            System.out.println("Deseja realizar outro cálculo? (s/n)");
            continuar = scanner.next();
        }
    }
}

