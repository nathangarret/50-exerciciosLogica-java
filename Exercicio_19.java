import java.util.Scanner;

public class Exercicio_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do círuculo: ");
        while (!scanner.hasNextDouble()){
            System.out.println("Digite um valor de um número válido.");
            scanner.next();
        }

        double raio = scanner.nextDouble();

        double area = calcularAreaCirculo(raio);

        System.out.println("A área do círculo com raio " + raio + " é: " + area);

        scanner.close();
    }

    static double calcularAreaCirculo(double raio){
        return Math.PI * Math.pow(raio, 2);
    }

}
