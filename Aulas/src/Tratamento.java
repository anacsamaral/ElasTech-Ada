public class Tratamento {
    public static void main(String[] args) {
        /* Tratamento de Erros
        * - Exceções
        * - Bloco Try Catch
        */

        try {
            int resultado = dividir(10,0);
            System.out.println("Resultado: " + resultado);
        }
        catch(ArithmeticException e) {

        }
    }
}
