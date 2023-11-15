import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio_20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.print("Digite a palavra a ser contada: ");
        String palavra = scanner.next();

        int numeroOcorrencias = contarOcorrencias(frase, palavra);

        System.out.println("A palavra '" + palavra + "' ocorre " + numeroOcorrencias + " vezes na frase.");

        scanner.close();
    }

    static int contarOcorrencias(String frase, String palavra) {

        String[] palavras = frase.split("\\s+");

        int contador = 0;

        for (String p : palavras) {
            p = p.replaceAll("[^a-zA-Z]", "");

            if (p.equalsIgnoreCase(palavra)) {
                contador++;
            }
        }

        return contador;
    }
}