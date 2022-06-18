package br.edu.infnet.mdps.mdps.model.repository;

import br.edu.infnet.mdps.mdps.model.domain.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    @Query("from Usuario u where u.email = :email and u.senha = :senha")
    Usuario autenticacao(String email, String senha);

    @Query("select count(Usuario) from Usuario u where u.tipo = 'D'")
    Integer obterQtdeDoulas();
    @Query("select count(Usuario) from Usuario u where u.tipo = 'G'")
    Integer obterQtdeGestantes();

}
