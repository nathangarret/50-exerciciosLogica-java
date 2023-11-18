import java.util.Scanner;

public class Exercicio_29 {

    public static void main(String[] args) {
        // 29)	Implemente um programa que calcule o volume de uma esfera. = raio - volume
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        double volume = calcularVolume(raio);

        System.out.println("O volume da esfera é no valor de: " + volume);

        scanner.close();
    }

    static double calcularVolume(double raio) {
        double pi = Math.PI;
        return (4.0 / 3.0) * pi * Math.pow(raio, 3);
    }

}