import java.util.Scanner;

public class Exercicio_32 {

    public static void main(String[] args) {
        // 32)	Escreva um programa que verifique se um número é uma potência de 2.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número pra saber se é uma potência de 2: ");
        int numero = scanner.nextInt();

        if (potenciaDeDois(numero)){
            System.out.println(numero + " é uma potência de 2.");
        } else {
            System.out.println(numero + " não é uma potência de 2.");
        }

        scanner.close();
    }

    static boolean potenciaDeDois(int numero) {
        return (numero > 0) && ((numero & (numero - 1)) == 0);
    }

}