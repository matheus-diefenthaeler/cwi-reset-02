package br.com.cwi.reset.exemploreset.service;


import br.com.cwi.reset.exemploreset.domain.Usuario;
import br.com.cwi.reset.exemploreset.exception.BadRequestException;
import br.com.cwi.reset.exemploreset.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obterUsuarios(){
        return usuarioRepository.getUsuarios();
    }

    public Usuario cadastrarUsuario(Usuario usuario){
        if(usuario.getNome() == null || usuario.getEmail()== null || usuario.getSenha() == null ){
            throw new BadRequestException();
        }

        if(usuario.getId() != null){
            throw new BadRequestException();
        }

        return usuarioRepository.salvarUsuario(usuario);
    }


    public void deletarUsuario(final Long idDeletar) {
        usuarioRepository.deletarUsuario(idDeletar);
    }
}
