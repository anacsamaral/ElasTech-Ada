package tech.ada.java.springapirest.api.postagem;

import jakarta.persistence.*;
import lombok.*;
import tech.ada.java.springapirest.api.usuario.Usuario;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Postagem {

    @Id
    @GeneratedValue
    private Long id;

    private UUID uuid;
    private String titulo;
    private String corpo;
    private LocalDate dataCriacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario autor;

}
