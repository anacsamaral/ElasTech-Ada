package tech.ada.java.springapirest.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.ada.java.springapirest.api.Usuario;

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
