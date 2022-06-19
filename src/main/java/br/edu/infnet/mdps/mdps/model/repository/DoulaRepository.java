package br.edu.infnet.mdps.mdps.model.repository;

import br.edu.infnet.mdps.mdps.model.domain.Doula;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoulaRepository extends CrudRepository<Doula, Integer> {
}
