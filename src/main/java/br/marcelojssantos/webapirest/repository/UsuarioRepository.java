package br.marcelojssantos.webapirest.repository;

import br.marcelojssantos.webapirest.handler.BusinessException;
import br.marcelojssantos.webapirest.handler.CampoObrigatórioException;
import br.marcelojssantos.webapirest.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository{

    static List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> findAll(){
        return getUsuarios();
    }

    public Usuario save(Usuario usuario){
        if(usuario.getLogin()==null)
            throw new CampoObrigatórioException("LOGIN");
        if(usuario.getPassword()==null)
            throw new CampoObrigatórioException("PASSWORD");

        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo USUÁRIO na camada de repositório!");
        else
            System.out.println("UPDATE - Recebendo USUÁRIO na camada de repositório!");

        return usuario;
    }

    public Usuario findByLogin(String login){
        System.out.println(String.format("FIND - Usuário %s recebido!", login));
        var novoUsuario = new Usuario("usuario.padrão", "0000");
        return novoUsuario;
    }

    public void delete(Integer id){
        System.out.println(String.format("DELETE - Usuário com Id: %s deletado!", id));
    }

    private static List<Usuario> getUsuarios() {
        usuarios.add(new Usuario("pedro.galaga", "1234"));
        usuarios.add(new Usuario("luzia.silveira.prado", "1234"));
        return usuarios;
    }
}
