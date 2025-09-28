public class Condicionais {
    public static void main(String[] args) {
        int nota = 6;
        if(nota >= 6){
            System.out.println("Aluno está aprovado.");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Aluno está de exame");
        } else {
            System.out.println("Aluno está reprovado");
        }
    }
}
