package br.edu.infnet.mdps.mdps.controller;

import br.edu.infnet.mdps.mdps.model.domain.Gestante;
import br.edu.infnet.mdps.mdps.model.domain.Usuario;
import br.edu.infnet.mdps.mdps.model.service.GestanteService;
import br.edu.infnet.mdps.mdps.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class GestanteController {

    @Autowired
    private GestanteService gestanteService;
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/gestantes")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("gestanteLista", usuarioService.obterLista());

        return "gestante/lista";
    }

    @GetMapping(value = "/gestante/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

        Usuario gestante = usuarioService.obterPorId(id);

        if(gestante != null) {
            try {
                gestanteService.excluir(id);
                model.addAttribute("mensagem", "A " +" getNome()" +" foi excluída com sucesso!!!");
            } catch (Exception e) {
                model.addAttribute("mensagem", "Impossível realizar a exclusão! A gestante está associada uma doula");
            }
        } else {
            model.addAttribute("mensagem", "Gestante inexistente.. impossível realizar a exclusão!!!");
        }

        return telaLista(model, usuario);
    }

}