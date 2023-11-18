import java.util.Scanner;

public class Exercicio_33 {

    public static void main(String[] args) {
        // 33)	Implemente um programa que calcule o máximo divisor comum (MDC) de dois números.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        int mdc = calcularMDC(numeroUm, numeroDois);

        System.out.println("O MDC de " + numeroUm + " e " + numeroDois + " é: " + mdc);

        scanner.close();
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
