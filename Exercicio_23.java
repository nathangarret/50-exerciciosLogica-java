import java.util.Scanner;

public class Exercicio_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < array.length; i++){
            System.out.println("Elemento: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        calcularQuadrado(array);

        System.out.println("Array com quadrados dos elementos:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }

    static void calcularQuadrado(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i];
        }
    }

}