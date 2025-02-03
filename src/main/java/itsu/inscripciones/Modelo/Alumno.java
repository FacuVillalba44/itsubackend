package itsu.inscripciones.Modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idAlumno;
    String nombreAlumno;
    String apellidoAlumno;
    Integer dniAlumno;
    LocalDate fechaNacimiento;
    String domicilioAlumno;
    Long telefonoAlumno;
    String emailAlumno;
    Integer idCarreraInscripto;
    String claveAcceso;

}
