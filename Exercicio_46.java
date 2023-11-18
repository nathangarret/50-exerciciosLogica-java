import java.util.Scanner;

public class Exercicio_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        double seno = Math.sin(Math.toRadians(anguloGraus));

        System.out.println("O seno do ângulo é: " + seno);
    }
}
