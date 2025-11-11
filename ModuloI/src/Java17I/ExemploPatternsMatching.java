package Java17I;

public class ExemploPatternsMatching {
    public static void main(String[] args) {

        Object obj = "Texto de exemplo";

        if(obj instanceof String str){
            System.out.println(str);
        }
    }
}

// outro exemplo

/*public class Pessoa {
    String nome;

    public Pessoa(String nome) {this.nome = nome;}

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Pessoa p){
            return this.nome.equals(p.nome);
        }
        return false;
    }
}
*/