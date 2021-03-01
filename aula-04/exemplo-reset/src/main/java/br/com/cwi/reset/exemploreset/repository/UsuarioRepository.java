package br.com.cwi.reset.exemploreset.repository;


import br.com.cwi.reset.exemploreset.domain.Usuario;
import br.com.cwi.reset.exemploreset.exception.NotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class UsuarioRepository {

    static List<Usuario> usuarios = new ArrayList<>();


    public List<Usuario> getUsuarios(){
        return usuarios;
    }


    public Usuario salvarUsuario(final Usuario usuario) {
        usuario.setId((long) (usuarios.size() + 1));
        usuarios.add(usuario);
        return usuario;
    }

    public void deletarUsuario(Long idDeletar) {
        Usuario deletar = null;
        for (Usuario usuario : usuarios){
            if(usuario.getId().equals(idDeletar) ){
                deletar = usuario;
            }
        }

        if(deletar == null){
            throw new NotFoundException();
        }

        usuarios.remove(deletar);

    }
}
