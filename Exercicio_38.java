import java.util.*;

public class Exercicio_38 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você deseja inserir? ");
        int quantidadeNumeros = scanner.nextInt();

        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite os números:");

        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros.add(scanner.nextInt());
        }

        int moda = encontrarModa(numeros);

        if (moda != Integer.MIN_VALUE) {
            System.out.println("A moda dos números é: " + moda);
        } else {
            System.out.println("Não há moda. Todos os números têm a mesma frequência.");
        }
    }

    public static int encontrarModa(List<Integer> numeros) {
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int numero : numeros) {
            frequencia.put(numero, frequencia.getOrDefault(numero, 0) + 1);
        }

        int moda = Integer.MIN_VALUE;
        int maxFrequencia = 0;

        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            int numero = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFrequencia) {
                maxFrequencia = freq;
                moda = numero;
            }
        }

        // Verifica se há mais de uma moda
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            int freq = entry.getValue();
            if (freq == maxFrequencia && entry.getKey() != moda) {
                return Integer.MIN_VALUE; // Retorna um valor especial se houver mais de uma moda
            }
        }

        return moda;
    }

}
