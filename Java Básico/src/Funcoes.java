public class Funcoes {
    public static void main(String[] args) {
        /*
        * CARACTERÍSTICAS IMPORTANTES
        * - Modularidade
        * - Reutilização de Código
        * - Abstração
        * - Parâmetros e Retorno
        * - Visibilidade
        */
        int resultado = soma(5,3);
        System.out.println("Resultado da soma: " + resultado);
    }
    public static int soma(int a, int b){
        return a + b;
    }

    public static double soma(double a, double b){
        return a + b;
    }

    public static int soma(int a, int b, int c){
        return a + b + c;
    }
}
