public class Strings {
    public static void main(String[] args) {
        // Característica importante das Strings em Java: Imutabilidade

        String nomeDigitado = "Ana Amaral";
        String nomeCadastrado = "ana amaral";

        // Comparação dos nomes
        boolean nomesIguais = nomeDigitado.equals(nomeCadastrado);
        System.out.println("Os nomes são exatamente iguais? " + nomesIguais);

        // Comparação ignorando maiúsculas e minúsculas
        boolean nomesIguaisIgnoraMaiuscula = nomeDigitado.equalsIgnoreCase(nomeCadastrado);
        System.out.println("Os nomes são exatamente iguais? " + nomesIguaisIgnoraMaiuscula);

        // Converter para letras maiúsculas
        String nomeMaiusculo = nomeDigitado.toUpperCase();
        System.out.println("Nome em maiúsculo: " + nomeMaiusculo);

        // Converter para letras minúsculas
        String nomeMinusculo = nomeDigitado.toLowerCase();
        System.out.println("Nome em minúsculo: " + nomeMinusculo);

        // Obter o tamanho da string
        int tamanho = nomeDigitado.length();
        System.out.println("O nome contém " + tamanho + " caracteres");

        // Saudação personalizada
        String saudacao = "Bem Vinda, ".concat(nomeMaiusculo).concat("!");
        System.out.println(saudacao);

        // Obter a primeira lerta do nome
        char primeiraLetra = nomeDigitado.charAt(0);
        System.out.println("A primeira letra do nome é" + primeiraLetra);

        // Ecnontrar a posição do sobrenome usando indexOf
        int posicaoSobrenome = nomeDigitado.indexOf("Amaral");
        if(posicaoSobrenome != -1){
            System.out.println("O sobrenome Amaral começa na posição " + posicaoSobrenome);
        }
        else {
            System.out.println("Sobrenome Amaral não foi encontrado");
        }
    }
}
