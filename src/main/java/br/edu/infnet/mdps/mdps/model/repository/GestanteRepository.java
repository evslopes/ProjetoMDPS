package br.edu.infnet.mdps.mdps.model.repository;

import br.edu.infnet.mdps.mdps.model.domain.Gestante;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GestanteRepository extends CrudRepository<Gestante, Integer> {
}
