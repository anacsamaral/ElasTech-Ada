package tech.ada.java;

public class Aplicacao {

    public static void main(String[] args) {
        Postagem postagem = new Postagem();
        postagem.setTitulo("Teste");
        System.out.println(postagem.getTitulo());
    }
}
