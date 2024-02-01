package ecentro;
import java.util.List;

public interface GrupoInterface {
    public List<Alumno> getAlumnos();
    public Alumno anadeAlumno(Alumno alum);
    public Alumno borraAlumno(Alumno alum);

}
