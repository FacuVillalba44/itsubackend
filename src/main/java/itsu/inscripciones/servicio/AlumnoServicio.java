package itsu.inscripciones.servicio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import itsu.inscripciones.Modelo.Alumno;
import itsu.inscripciones.repositorio.AlumnoRepositorio;

@SuppressWarnings("unused")
@Service

public class AlumnoServicio implements IAlumnoServicio {
    @Autowired
    private AlumnoRepositorio alumnoRepositorio;


    @Override
    public List<Alumno> listarAlumnos() {
      
        return this.alumnoRepositorio.findAll();
    }

    @Override
    public Alumno buscarAlumnoPorId(Integer id) {
   
       Alumno alumno = this.alumnoRepositorio.findById(id).orElse(null);
        return alumno;
    }

    @Override
    public Alumno guardarAlumno(Alumno alumno) {
        // si no existe el id en la bd ingresa un nuevo registro, si existe, lo actualiza
        return this.alumnoRepositorio.save(alumno);
    }
 
    @Override
    public void eliminarAlumno(Integer idAlumno) {
    
        this.alumnoRepositorio.deleteById(idAlumno);
    }

}
