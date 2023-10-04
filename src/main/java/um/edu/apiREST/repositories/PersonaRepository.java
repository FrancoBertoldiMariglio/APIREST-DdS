package um.edu.apiREST.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import um.edu.apiREST.entities.Persona;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
