import java.util.List;

import ecentro.Alumno;
import ecentro.Grupo;
import ecentro.Identifier;
import ecentro.Model;

public class App {
    public static void main(String[] args) throws Exception {

        Model grupos = new Model();
        Model alumnos = new Model();
        Alumno alum = (Alumno)alumnos.add(new Alumno("", "Juan Antonio","García", ""));
        Grupo grupo = (Grupo) grupos.add(new Grupo("", "1ºESOA"));
        grupo.anadeAlumno(alum);
        List<Alumno> alumnosdelGrupo = grupo.getAlumnos();
        System.out.println(alumnosdelGrupo);
    }
}
