public class Tratamento {
    public static void main(String[] args) {
        /* Tratamento de Erros
        * - Exceções
        * - Bloco Try Catch
        */

        try {
            int resultado = dividir(10,2);
            System.out.println("Resultado: " + resultado);
        }
        catch(ArithmeticException e) {
            System.out.println("Erro: divisão por zero.");
        } finally {
            System.out.println("Bloco finally sendo executado");
        }
    }
    public static int dividir(int a, int b){
        return a / b;
    }
}