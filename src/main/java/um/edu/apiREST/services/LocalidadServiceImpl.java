package um.edu.apiREST.services;

import org.springframework.stereotype.Service;
import um.edu.apiREST.entities.Localidad;
import um.edu.apiREST.repositories.BaseRepository;


@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
