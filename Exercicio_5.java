import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        int[] array = {10, 50, 19, 61, 85, 44};

        int maior = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
            }
        }

        System.out.println("O maior elemento do array é: " + maior);
    }
}
