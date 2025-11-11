package Java21;

public class ExemploStringTemplate {
    public static void main(String[] args) {
        String nome = "João";
        int idade = 30;
        String texto = "Nome: " + nome + ", Idade: " + idade;
        System.out.println(texto);

        String nome2 = "João";
        int idade2 = 30;
        String texto2 = STR."Nome: \{nome2} Idade: \{idade2}";
        System.out.println(texto2);

    }
}
