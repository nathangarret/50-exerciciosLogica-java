import java.util.Scanner;

public class Exercicio_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = { 12, 45, 67, 23, 56, 89, 34 };

        System.out.println("Digite o valor a ser pesquisado: ");
        int valor = scanner.nextInt();

        int posicao = pesquisaLinear(array, valor);

        if (posicao != - 1){
            System.out.println("O valor '" + valor + "' foi encontrado na posição " + posicao + " do array.");
        } else {
            System.out.println("O valor '" + valor + "' não foi encontrado no array.");
        }

        scanner.close();
    }

    static int pesquisaLinear(int[] arr, int valor){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == valor){
                return i;
            }
        }
        return - 1;
    }

}