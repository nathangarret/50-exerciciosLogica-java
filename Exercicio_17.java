import java.util.Scanner;

public class Exercicio_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numUm = scanner.nextInt();

        System.out.println("Digite o dois número: ");
        int numDois = scanner.nextInt();

        int MMC = calcularMMC(numUm, numDois);

        System.out.println("O MMC de " + numUm + " e " + numDois + " é: " + MMC);

        scanner.close();
    }

    static int calcularMMC(int a, int b) {
        int mdc = calcularMDC(a, b);

        // Evita divisão por zero
        if (mdc != 0) {
            return Math.abs(a * b) / mdc;
        } else {
            return 0;
        }
    }

    static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
