package br.edu.infnet.mdps.mdps.model.service;

import br.edu.infnet.mdps.mdps.model.domain.Gestante;
import br.edu.infnet.mdps.mdps.model.repository.GestanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestanteService {
    @Autowired
    private GestanteRepository gestanteRepository;

    public void incluir(Gestante gestante) {
        gestanteRepository.save(gestante);
    }

    public void excluir(Integer id) {
        gestanteRepository.deleteById(id);
    }

    public Gestante obterPorId(Integer id) {
        return gestanteRepository.findById(id).orElse(null);
    }

//    public Collection<Usuario> obterLista(Usuario gestante) {
//        return (Collection<Usuario>) gestanteRepository.findAll(gestante.getId(), Sort.by(Sort.Direction.ASC, "nome"));
//    }
//
//    public Collection<Usuario> obterLista() {
//        return (Collection<Usuario>) gestanteRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
//    }

    public Integer obterQtde(){
        return (int) gestanteRepository.count();
    }
}
