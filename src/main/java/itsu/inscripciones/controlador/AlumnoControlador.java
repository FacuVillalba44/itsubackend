package itsu.inscripciones.controlador;

import org.springframework.web.bind.annotation.RestController;

import itsu.inscripciones.Modelo.Alumno;
import itsu.inscripciones.servicio.AlumnoServicio;

import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SuppressWarnings("unused")
@RestController

//context-path = http://localhost:8080/itsuapi/ <- se vería así el url de la api
@RequestMapping("/itsuapi")
//Puerto desde donde recibira las peticiones del front
@CrossOrigin(origins = "https://4200-idx-itsufront-1737645545390.cluster-vpxjqdstfzgs6qeiaf7rdlsqrc.cloudworkstations.dev")

public class AlumnoControlador {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(AlumnoControlador.class);

    @Autowired
    private AlumnoServicio alumnoServicio;

    //url donde se conectara es http://localhost:8080/api-itsu/alumnos    
    @GetMapping("/alumnos")
    public  List<Alumno> obtenerAlumnos(){
        List <Alumno> alumnos= this.alumnoServicio.listarAlumnos();
        logger.info("Obteniendo la lista de alumnos");
        alumnos.forEach(alumno -> logger.info(alumno.toString()));
        return alumnos;
    }

}
