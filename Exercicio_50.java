import java.util.*;

public class Exercicio_50 {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>(Arrays.asList(1, 2, 3));

        List<Set<Integer>> subconjuntos = gerarSubconjuntos(conjunto);
        for (Set<Integer> subconjunto : subconjuntos) {
            System.out.println(subconjunto);
        }
    }

    public static List<Set<Integer>> gerarSubconjuntos(Set<Integer> conjunto) {
        List<Set<Integer>> subconjuntos = new ArrayList<>();
        subconjuntos.add(new HashSet<>()); // Adiciona o conjunto vazio

        for (int elemento : conjunto) {
            List<Set<Integer>> novosSubconjuntos = new ArrayList<>();
            for (Set<Integer> subconjunto : subconjuntos) {
                Set<Integer> novo = new HashSet<>(subconjunto);
                novo.add(elemento);
                novosSubconjuntos.add(novo);
            }
            subconjuntos.addAll(novosSubconjuntos);
        }

        return subconjuntos;
    }
}
