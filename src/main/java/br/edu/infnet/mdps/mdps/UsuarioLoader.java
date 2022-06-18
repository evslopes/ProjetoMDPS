package br.edu.infnet.mdps.mdps;

import br.edu.infnet.mdps.mdps.model.domain.Usuario;
import br.edu.infnet.mdps.mdps.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String email = "elvis@elvis.com";
        String senha = "1234";

        Usuario usuario = null;

        usuario = usuarioService.autenticacao(email, senha);

        if(usuario == null) {

            usuario = new Usuario();
            usuario.setNome("Elvis Lopes");
            usuario.setEmail("elvis@elvis.com");
            usuario.setSenha("1234");
            usuario.setAdmin(true);
            usuario.setTipo('D');
            usuarioService.incluir(usuario);

        }

        usuario = new Usuario();
        usuario.setNome("Luana Lopes");
        usuario.setEmail("Luana@luana.com");
        usuario.setSenha("1234");
        usuario.setAdmin(true);
        usuario.setTipo('G');
        usuarioService.incluir(usuario);

        for (int i = 0; i < 10; i++ ) {

            usuario = new Usuario();
            usuario.setNome("Teste" + i);
            usuario.setEmail("teste@" + i + ".com");
            usuario.setSenha("1234");
            usuario.setAdmin(false);
            usuario.setTipo('D');
            usuarioService.incluir(usuario);

        }

        for (int i = 10; i < 20; i++ ) {

            usuario = new Usuario();
            usuario.setNome("Teste" + i);
            usuario.setEmail("teste@" + i + ".com");
            usuario.setSenha("1234");
            usuario.setAdmin(false);
            usuario.setTipo('G');
            usuarioService.incluir(usuario);

        }


    }
}

