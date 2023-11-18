import java.util.Scanner;

public class Exercicio_41 {

    public static void main(String[] args) {
        // Implemente um programa que encontre o segundo maior elemento em um array.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array");
        int tamanhoArray = scanner.nextInt();

        int[] arr = new int[tamanhoArray];

        System.out.println("Digite os elementos da array: ");

        for (int i = 0; i < tamanhoArray; i++){
            arr[i] = scanner.nextInt();
        }

        int segundoMaior = pesqSegundoMaior(arr);

        if (segundoMaior != Integer.MIN_VALUE) {
            System.out.println("O segundo maior elemento é: " + segundoMaior);
        } else {
            System.out.println("Não há segundo maior elemento.");
        }
    }

    static int pesqSegundoMaior(int[] arr) {
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maior){
                segundoMaior = maior;
                maior = arr[i];
            } else if (arr[i] > segundoMaior && arr[i] != maior) {
                segundoMaior = arr[i];
            }
        }

        return segundoMaior;
    }

}