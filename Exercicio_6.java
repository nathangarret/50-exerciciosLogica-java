import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

        int[] array = {1, 155, 5, 7, 99, 3};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Array ordenado");
        for (int num : array){
            System.out.println(num + "");
        }
    }

}
