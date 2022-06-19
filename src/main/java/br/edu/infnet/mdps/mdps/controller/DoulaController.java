package br.edu.infnet.mdps.mdps.controller;

import br.edu.infnet.mdps.mdps.model.domain.Doula;
import br.edu.infnet.mdps.mdps.model.domain.Gestante;
import br.edu.infnet.mdps.mdps.model.domain.Usuario;
import br.edu.infnet.mdps.mdps.model.service.DoulaService;
import br.edu.infnet.mdps.mdps.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class DoulaController {

    @Autowired
    private DoulaService doulaService;
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping(value = "/doulas")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("doulaLista", usuarioService.obterLista());

        return "doula/lista";
    }

    @GetMapping(value = "/doula/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

        Usuario doula = usuarioService.obterPorId(id);

        if(doula != null) {
            try {
                doulaService.excluir(id);
                model.addAttribute("mensagem", "A " +" getNome()" +" foi excluída com sucesso!!!");
            } catch (Exception e) {
                model.addAttribute("mensagem", "Impossível realizar a exclusão! A doula está associada a uma gestante");
            }
        } else {
            model.addAttribute("mensagem", "Doula inexistente.. impossível realizar a exclusão!!!");
        }

        return telaLista(model, usuario);
    }

}