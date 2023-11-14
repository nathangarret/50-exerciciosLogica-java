import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o vetorial: ");
        int numeroFat = scanner.nextInt();

        int resultado = calculoVetorial(numeroFat);
        System.out.println("O fatorial de: " + numeroFat + " é: " + resultado);
        scanner.close();

    }

    static int calculoVetorial(int x){
        if(x == 0 || x == 1){
            return 1;
        } else {
            return x * calculoVetorial(x - 1);
        }
    }

}
