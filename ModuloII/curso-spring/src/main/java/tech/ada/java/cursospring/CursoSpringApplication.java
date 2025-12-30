package tech.ada.java.cursospring;

import tech.ada.java.cursospring.api.Postagem;

public class CursoSpringApplication {

    public static void main(String[] args) {
        Postagem postagem = new Postagem();
        postagem.setTitulo("Teste");
        System.out.println(postagem.getTitulo());
    }
}
