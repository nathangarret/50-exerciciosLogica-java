import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        boolean saoAnagramas = verificarAnagrama(palavra1, palavra2);

        if (saoAnagramas) {
            System.out.println(palavra1 + " e " + palavra2 + " são anagramas.");
        } else {
            System.out.println(palavra1 + " e " + palavra2 + " não são anagramas.");
        }

        scanner.close();
    }

    static boolean verificarAnagrama(String palavra1, String palavra2) {

        palavra1 = palavra1.replaceAll("\\s", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s", "").toLowerCase();

        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        char[] arr1 = palavra1.toCharArray();
        char[] arr2 = palavra2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}