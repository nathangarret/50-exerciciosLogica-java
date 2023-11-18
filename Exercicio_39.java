import java.util.Scanner;

public class Exercicio_39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int numeroPalavras = contarPalavras(frase);

        System.out.println("O número de palavras na frase é: " + numeroPalavras);
    }

    static int contarPalavras(String frase) {
        if (frase == null || frase.isEmpty()){
            return 0;
        }

        String[] palavras = frase.split("\\s+");
        return palavras.length;
    }

}