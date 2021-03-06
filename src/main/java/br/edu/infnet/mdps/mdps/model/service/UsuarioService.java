package br.edu.infnet.mdps.mdps.model.service;

import br.edu.infnet.mdps.mdps.model.domain.Usuario;
import br.edu.infnet.mdps.mdps.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario autenticacao(String email, String senha) {
        return usuarioRepository.autenticacao(email, senha);
    }

    public void incluir(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public Collection<Usuario> obterLista(){
        return (Collection<Usuario>) usuarioRepository.findAll();
    }

    public Usuario obterPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Integer obterQtde(){
        return (int) usuarioRepository.count();
    }
    public Integer obterQtdeDoulas(){
        return usuarioRepository.obterQtdeDoulas();
    }

    public Integer obterQtdeGestantes(){
        return usuarioRepository.obterQtdeGestantes();
    }


}
