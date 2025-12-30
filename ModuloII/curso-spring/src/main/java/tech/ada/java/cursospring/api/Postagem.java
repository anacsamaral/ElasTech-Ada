package tech.ada.java.cursospring.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Postagem {

    private UUID uuid;
    private String titulo;
    private String corpo;
    private LocalDate dataCriacao;
    private Usuario autor;

}
