import java.util.Scanner;

public class Exercicio_22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o valor final do intervalo: ");
        int fim = scanner.nextInt();

        System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");
        numPrimosIntervalo(inicio, fim);

        scanner.close();
    }

    static boolean isPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    static void numPrimosIntervalo(int inicio, int fim){
        for (int i = inicio; i <= fim; i++){
            if (isPrimo(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

}