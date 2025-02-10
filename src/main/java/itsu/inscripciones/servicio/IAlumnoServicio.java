package itsu.inscripciones.servicio;
import itsu.inscripciones.Modelo.Alumno;
import java.util.List;
public interface IAlumnoServicio {
    public List<Alumno> listarAlumnos();
    public Alumno buscarAlumnoPorId(Integer id);
    //Alumno =  tipo de objeto que se va a guardar y alumno = valor que se va a guardar 
    public Alumno guardarAlumno(Alumno alumno); 
    public void eliminarAlumno(Integer idAlumno);

    /*public Alumno actualizarAlumno(Alumno alumno);
    */

}
