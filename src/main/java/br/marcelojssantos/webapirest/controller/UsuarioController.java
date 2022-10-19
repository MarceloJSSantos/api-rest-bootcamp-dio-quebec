package br.marcelojssantos.webapirest.controller;

import br.marcelojssantos.webapirest.model.Usuario;
import br.marcelojssantos.webapirest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario saveUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/{login}")
    @ResponseStatus(HttpStatus.FOUND)
    public Usuario findByLogin(@PathVariable("login") String login){
        return usuarioRepository.findByLogin(login);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable() Integer id){
        usuarioRepository.delete(id);
    }
}
