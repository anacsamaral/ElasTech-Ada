public class BooleanosLogicos {
    public static void main(String[] args) {
        /*
        1) MATEMÁTICOS
        + soma
        - subtração
        * multiplicação
        / divisão
        % resto

         2) RELACIONAIS
         == igual
         != diferente
         >  maior
         <  menor
         >= maior ou igual
         <= menor ou igual

         3) LÓGICOS
         && AND
         || OR
         !  NOT
         */

        int a = 10;
        int b = 20;

        int soma = a + b;
        System.out.println(soma);
        int subtracao = a - b;
        System.out.println(subtracao);
        int multiplicacao = a * b;
        System.out.println(multiplicacao);
        double divisao = (double)a / b;
        System.out.println(divisao);
        int resto = a % b;
        System.out.println(resto);

        boolean resultado = (a == b);
        System.out.println(resultado);
        boolean resultado2 = (a >= b);
        System.out.println(resultado2);
        boolean resultado3 = (a != b);
        System.out.println(resultado3);
    }
}
