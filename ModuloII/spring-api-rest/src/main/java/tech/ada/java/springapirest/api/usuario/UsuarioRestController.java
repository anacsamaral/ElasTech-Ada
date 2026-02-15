package tech.ada.java.springapirest.api.usuario;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import tech.ada.java.springapirest.api.exception.NaoEncontradoException;

import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {

    private final UsuarioJpaRepository repository;

    public UsuarioRestController(UsuarioJpaRepository repository){
        this.repository = repository;
    }

    @GetMapping("/dummy")
    public Usuario dummyUsuario(){
        return new Usuario(UUID.randomUUID(), "Geovana", "gigimeuamor@gmail.com", LocalDate.now());
    }

    //CRUD - Create, Read, Update, Delete
    //HTTP - POST, GET, PUT, PATCH, DELETE

    @GetMapping
    public List<Usuario> listarTodos(){
        return this.repository.findAll();
    }

    @GetMapping("/{uuid}") // tratar como variável
    public Usuario buscarPorUuid(@PathVariable UUID uuid){
        return this.repository.findByUuid(uuid)
                .orElseThrow(() -> new NaoEncontradoException("Usuário não encontrado."));
    }

    @PostMapping("/")
    public Usuario criarUsuario(@RequestBody @Valid Usuario usuario){
        return this.repository.save(usuario);
    }

    @PostMapping("/create-dummy")
    public Usuario createDummy(){
        Usuario dummy = new Usuario(UUID.randomUUID(), "Dummy", "dummy@example.com", LocalDate.now());
        return this.criarUsuario(dummy);
    }

    @PutMapping("/{uuid}")
    public Usuario atualizarUsuario(@PathVariable UUID uuid, @RequestBody @Valid Usuario usuarioNovo){
        Usuario usuario = this.buscarPorUuid(uuid);
        usuarioNovo.setId(usuario.getId());
        return this.repository.save(usuarioNovo);
    }

    @PatchMapping("/{uuid}/alterar-nome")
    public Usuario alterarNome(@PathVariable UUID uuid, @RequestBody Usuario usuarioAlterado){
        Usuario usuario = this.buscarPorUuid(uuid);
        usuario.setNome(usuarioAlterado.getNome());
        return usuarioAlterado;
    }

    @Transactional
    @DeleteMapping("/{uuid}")
    public void deletarUsuario(@PathVariable UUID uuid){
        this.repository.deleteByUuid(uuid);
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
