package br.edu.infnet.mdps.mdps.model.service;

import br.edu.infnet.mdps.mdps.model.domain.Doula;
import br.edu.infnet.mdps.mdps.model.domain.Usuario;
import br.edu.infnet.mdps.mdps.model.repository.DoulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DoulaService {
    @Autowired
    private DoulaRepository doulaRepository;

    public void incluir(Doula doula) {
        doulaRepository.save(doula);
    }

    public void excluir(Integer id) {
        doulaRepository.deleteById(id);
    }

    public Doula obterPorId(Integer id) {
        return doulaRepository.findById(id).orElse(null);
    }

//    public Collection<Doula> obterLista(Doula doula) {
//        return (Collection<Doula>) doulaRepository.findAll(doula.getIdDoula(), Sort.by(Sort.Direction.ASC, "nome"));
//    }
//
//    public Collection<Doula> obterLista() {
//        return (Collection<Doula>) doulaRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
//    }

    public Integer obterQtde(){
        return (int) doulaRepository.count();
    }
}
