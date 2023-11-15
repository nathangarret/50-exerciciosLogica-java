import java.util.Scanner;

public class Exercicio_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperatura em Celsius: ");

        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheint = (temperaturaCelsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheint é: " + temperaturaFahrenheint);

        scanner.close();
    }

}
