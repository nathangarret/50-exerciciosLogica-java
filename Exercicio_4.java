import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Phrase: ");
        String frase = scanner.nextLine();
        String fraseReverse = new StringBuilder(frase).reverse().toString();

        System.out.println(fraseReverse);
    }

}
