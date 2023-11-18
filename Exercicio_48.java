public class Exercicio_48 {
    public static void main(String[] args) {
        String texto = "123";

        try {
            int numero = Integer.parseInt(texto);
            System.out.println(texto + " é um número inteiro.");
        } catch (NumberFormatException e) {
            System.out.println(texto + " não é um número inteiro.");
        }
    }
}
