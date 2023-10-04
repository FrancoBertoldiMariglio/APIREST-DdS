package um.edu.apiREST.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import um.edu.apiREST.entities.Localidad;
import um.edu.apiREST.entities.Persona;
import um.edu.apiREST.services.LocalidadServiceImpl;
import um.edu.apiREST.services.PersonaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}
