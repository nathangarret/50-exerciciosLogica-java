import java.util.Scanner;

public class Exercicio_24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String fraseInvertida = inverterOrdemPalavras(frase);

        System.out.println("Frase com as palavras invertidas: ");
        System.out.println(fraseInvertida);

        scanner.close();
    }

    static String inverterOrdemPalavras(String frase) {
        String[] palavras = frase.split("\\s+");

        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            fraseInvertida.append(palavras[i]).append(" ");
        }

        return fraseInvertida.toString().trim();
    }

}
