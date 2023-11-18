import java.util.Scanner;

public class Exercicio_30 {

    public static void main(String[] args) {
        // 30)	Desenvolva um programa que remova os espaços em branco de uma string.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String fraseSemEspacos = removerEspacos(frase);

        System.out.println("Frase sem espaços: " + fraseSemEspacos);

        scanner.close();
    }

    static String removerEspacos(String frase){
        return frase.replaceAll("\\s", "");
    }

}