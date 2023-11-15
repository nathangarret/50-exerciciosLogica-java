import java.util.Scanner;

public class Exercicio_14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String inputString = scanner.nextLine();

        int numeroVogais = contarVogais(inputString);

        System.out.println("O número de vogais na string é de: " + numeroVogais);

        scanner.close();
    }

    static int contarVogais(String string){
        int count = 0;

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++){
            char chr = string.charAt(i);

            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'){
                count++;
            }
        }

        return count;
    }

}