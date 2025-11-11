package Java17I;

public class ExemploSwitch {
    public static void main(String[] args) {

        int dia = 2;

        String nomeDia = switch (dia){
            case 1 -> "Domingo";
            case 2 -> "Segunda-Feira";
            default -> "Dia inválido";
        };

        System.out.println(nomeDia);
    }
}
