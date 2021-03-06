package br.edu.infnet.mdps.mdps.controller;

import br.edu.infnet.mdps.mdps.model.domain.Doula;
import br.edu.infnet.mdps.mdps.model.domain.Gestante;
import br.edu.infnet.mdps.mdps.model.domain.Usuario;
import br.edu.infnet.mdps.mdps.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @GetMapping(value = "/usuarios")
    public String telaLista(Model model) {

        model.addAttribute("usuarioLista", usuarioService.obterLista());

        return "usuario/lista";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario){

        usuarioService.incluir(usuario);
        return "redirect:/";
    }

    @GetMapping(value = "/usuario/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id) {

        Usuario usuario = usuarioService.obterPorId(id);

        if(usuario != null) {
            usuarioService.excluir(id);

            model.addAttribute("mensagem", "O usuário "+usuario.getNome()+" foi excluído com sucesso!!!");
        } else {
            model.addAttribute("mensagem", "Usuário inexistente.. impossível realizar a exclusão!!!");
        }

        return telaLista(model);
    }

//    private String obterTipoUsuario(Usuario usuario) {
//        String tipoUsuario = null;
//
//        if(usuario instanceof Gestante) {
//            tipoUsuario = "gestante";
//        }else if (usuario instanceof Doula) {
//            tipoUsuario = "doula";
//        }else {
//            tipoUsuario = "Administrador";
//        }
//
//        return tipoUsuario;
//    }
}
