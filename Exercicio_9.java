public class Exercicio_9 {

    public static void main(String[] args) {
        int[] array = { 2, 10};
        double media = calcularMedia(array);
        System.out.println("A média do array é de: " + media);
    }

    static double calcularMedia(int[] array){
        int soma = 0;
        for (int num : array){
            soma += num;
        }
        return (double) soma / array.length;
    }

}
