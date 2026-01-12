package tech.ada.java.springapirest.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import tech.ada.java.springapirest.api.exception.NaoEncontradoException;

import java.time.LocalDate;
import java.util.*;

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

    @GetMapping("/{uuid}") // tratar como variável
    public Usuario buscarPorUuid(@PathVariable UUID uuid){
        return usuarioList.stream()
                .filter(usuario -> usuario.getUuid().equals(uuid))
                .findFirst()
                .orElseThrow(() -> new NaoEncontradoException("Não foi possível encontrar o usuário."));
    }

    @PostMapping("/")
    public Usuario criarUsuario(@RequestBody @Valid Usuario usuario){
        this.usuarioList.add(usuario);
        return usuario;
    }

    @PostMapping("/create-dummy")
    public Usuario createDummy(){
        Usuario dummy = new Usuario(UUID.randomUUID(), "Dummy", "dummy@example.com", LocalDate.now());
        return this.criarUsuario(dummy);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable UUID id, @RequestBody @Valid Usuario usuarioNovo){
        Usuario usuario = this.buscarPorUuid(id);
        this.usuarioList.set(this.usuarioList.indexOf(usuario), usuarioNovo);
        return usuarioNovo;
    }

    @PatchMapping("/{uuid}/alterar-nome")
    public Usuario alterarNome(@PathVariable UUID uuid, @RequestBody Usuario usuarioAlterado){
        Usuario usuario = this.buscarPorUuid(uuid);
        usuario.setNome(usuarioAlterado.getNome());
        this.usuarioList.set(this.usuarioList.indexOf(usuario), usuarioAlterado);
        return usuarioAlterado;
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable UUID id){
        this.usuarioList.removeIf(usuario -> usuario.getUuid().equals(id));
    }

//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex){
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//        return errors;
//    }
}
