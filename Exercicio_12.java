public class Exercicio_12 {

    public static void main(String[] args) {

        int[] arr = { 99, 199 };

        int menorElemento = menorNumero(arr);

        System.out.println("O menor número do array é: " + menorElemento);

    }

    static int menorNumero(int[] arr){

        if (arr.length == 0){
            System.out.println("O array está vazio.");
            return Integer.MIN_VALUE;
        }

        int menorElemento = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < menorElemento){
                menorElemento = arr[i];
            }
        }

        return menorElemento;
    }

}
