import java.util.Scanner;

public class Exercicio_31 {

    public static void main(String[] args) {
        // 31)	Crie um programa que conte o número de caracteres em uma string.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um frase: ");
        String frase = scanner.nextLine();

        int caracteres = contarCaracter(frase);

        System.out.println("Número de caracteres na frase é de: " + caracteres);

        scanner.close();
    }

    static int contarCaracter(String frase) {
        return frase.length();
    }

}