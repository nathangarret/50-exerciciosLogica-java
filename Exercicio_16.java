import java.util.Scanner;

public class Exercicio_16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de termos da sequência da Fibonnaci: ");

        while (!scanner.hasNextInt()){
            System.out.println("Digite um número válido.");
            scanner.next();
        }

        int n = scanner.nextInt();

        gerarFibonnaci(n);

        scanner.close();
    }

    static void gerarFibonnaci(int n){
        int termoUm = 0;
        int termoDois = 1;

        System.out.println("Os primeiro número " + n + " termos da sequência de Fibonacci são:");

        for (int i = 0; i < n; i++){
            System.out.println(termoUm + " ");

            int proximoTermo = termoUm + termoDois;
            termoUm = termoDois;
            termoDois = proximoTermo;
        }

    }

}
