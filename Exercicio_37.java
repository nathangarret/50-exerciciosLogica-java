import java.util.Scanner;

public class Exercicio_37 {

    public static void main(String[] args) {
        // Implemente um programa que calcule a média ponderada de um conjunto de notas.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas notas você deseja inserir? ");
        int quantidadeNotas = scanner.nextInt();

        double somaNotas = 0;
        double somaPesos = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();

            System.out.print("Digite o peso da nota " + i + ": ");
            double peso = scanner.nextDouble();

            somaNotas += nota * peso;
            somaPesos += peso;
        }

        if (somaPesos > 0) {
            double mediaPonderada = somaNotas / somaPesos;
            System.out.println("A média ponderada é: " + mediaPonderada);
        } else {
            System.out.println("Não foi possível calcular a média ponderada. Divisão por zero.");
        }
    }

}
