import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número (inteiro ou de ponto flutuante): ");
        String input = scanner.nextLine();

        try {
            int numeroInteiro = Integer.parseInt(input);
            System.out.println("Você inseriu um número inteiro: " + numeroInteiro);
        } catch (NumberFormatException e1) {
            try {

                double numeroFlutuante = Double.parseDouble(input);
                System.out.println("Você inseriu um número de ponto flutuante: " + numeroFlutuante);
            } catch (NumberFormatException e2) {

                System.out.println("Erro: A string inserida não é um número válido.");
            }
        }
        finally {
            scanner.close();
        }
    }
}
