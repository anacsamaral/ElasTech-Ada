package tech.ada.java.springapirest.api;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {

    private final List<Usuario> usuarioList = new ArrayList<>();

    @GetMapping("/dummy")
    public Usuario dummyUsuario(){
        return new Usuario(UUID.randomUUID(), "Ana", "ana.caroline@gmail.com", LocalDate.now());
    }

    //CRUD - Create, Read, Update, Delete
    //HTTP - POST, GET, PUT, PATCH, DELETE



    @GetMapping
    public List<Usuario> listarTodos(){
        return this.usuarioList;
    }

    @GetMapping("/{uuid}")
    public Usuario buscarPorUuid(@PathVariable UUID uuid){
        return usuarioList.stream()
                .filter(usuario -> usuario.getUuid().equals(uuid))
                .findFirst()
                .orElseThrow();
    }

    public Usuario

    @PostMapping("/create-dummy")
    public Usuario createDummy(){
        Usuario dummy = new Usuario(UUID.randomUUID(), "Dummy", "dummy@example.com", LocalDate.now());
        return this.criarUsuario(dummy);
    }

}
