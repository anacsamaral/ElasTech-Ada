package tech.ada.java.cursospring.api;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private UUID uuid;
    private String nome;
    private String email;
    private LocalDate dob;
}
