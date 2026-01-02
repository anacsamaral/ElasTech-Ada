package tech.ada.java.springapirest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {

    @GetMapping("/dummy")
    public Usuario dummyUsuario(){
        return new Usuario(UUID.randomUUID(), "Ana", "ana.caroline@gmail.com", LocalDate.now());
    }
}
