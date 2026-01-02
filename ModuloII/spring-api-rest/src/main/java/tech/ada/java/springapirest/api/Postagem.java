package tech.ada.java.springapirest.api;

import lombok.*;
import tech.ada.java.springapirest.api.Usuario;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Postagem {

    private UUID uuid;
    private String titulo;
    private String corpo;
    private LocalDate dataCriacao;
    private Usuario autor;

}
