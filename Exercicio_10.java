public class Exercicio_10 {

    public static void main(String[] args){
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;

        int result = pesquisaBinaria(arr, 0, n - 1, x);

        if (result == - 1){
            System.out.println("Elemento não está presente no array.");
        } else {
            System.out.println("Elemento encontrado no índice: " + result);
        }

    }

    static int pesquisaBinaria(int arr[], int left, int right, int x){
        if (right >= left){
            int mid = left + (right - left) / 2;

            if (arr[mid] == x){
                return mid;
            }

            if (arr[mid] > x){
                return pesquisaBinaria(arr, left, mid - 1, x);
            }

            return pesquisaBinaria(arr, mid + 1, right, x);
        }

        return - 1;
    }

}
