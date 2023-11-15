import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular a raiz quadrada: ");

        while (!scanner.hasNextDouble()){
            System.out.println("Por favor, digite um número válido.");
            scanner.next();
        }

        double numero = scanner.nextDouble();

        double raizQuadrada = calcularRaiz(numero);

        System.out.println("A raiz quadrada é de: " + numero + " é: " + raizQuadrada);

        scanner.close();
    }

    static double calcularRaiz(double numero) {
        return Math.sqrt(numero);
    }

}