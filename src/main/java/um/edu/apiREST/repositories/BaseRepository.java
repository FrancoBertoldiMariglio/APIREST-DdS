package um.edu.apiREST.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import um.edu.apiREST.entities.Base;
import java.io.Serializable;

public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
