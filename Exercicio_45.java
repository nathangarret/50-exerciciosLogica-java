import java.util.Scanner;

public class Exercicio_45 {

    public static void main(String[] args) {
        // Implemente um programa que verifique se uma matriz é esparsa.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        if (verificarMatrizEsparsa(matriz)) {
            System.out.println("A matriz é esparsa.");
        } else {
            System.out.println("A matriz não é esparsa.");
        }
    }

    public static boolean verificarMatrizEsparsa(int[][] matriz) {
        int totalElementos = matriz.length * matriz[0].length;
        int elementosNaoZero = 0;

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento != 0) {
                    elementosNaoZero++;
                }
            }
        }

        double percentualNaoZero = (double) elementosNaoZero / totalElementos;
        return percentualNaoZero < 0.5; // Se menos da metade dos elementos for não zero, consideramos a matriz esparsa
    }

}