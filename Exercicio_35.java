import java.util.Scanner;

public class Exercicio_35 {

    public static void main(String[] args) {
        // 35)	Crie um programa que calcule a soma dos dígitos de um número.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int soma = calcularDigitos(numero);

        System.out.println("A soma entre os dígitos:" + numero + " é de: " + soma);

        scanner.close();
    }

    static int calcularDigitos(int numero) {
        int soma = 0;

        while (numero != 0){
            int digito = numero % 10;
            soma += digito;
            numero /= 10;
        }

        return soma;
    }

}
