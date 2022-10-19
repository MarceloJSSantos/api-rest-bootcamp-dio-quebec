package br.marcelojssantos.webapirest.controller;

import br.marcelojssantos.webapirest.model.Usuario;
import br.marcelojssantos.webapirest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BemVindoController {

    @GetMapping("/")
    public String bemVindo(){
        return "Seja bem-vindo a minha API REST!";
    }
}
