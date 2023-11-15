import java.util.Scanner;

public class Exercicio_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número pra saber se ele é: (positivo, negativo ou zero)");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("positivo");
        } else if (numero == 0){
            System.out.println("zero");
        } else {
            System.out.println("negativo");
        }

        scanner.close();
    }

}