import java.util.List;

import ecentro.Alumno;
import ecentro.Grupo;
import ecentro.Model;
import ecentro.Usuario;
import ecentro.UsuariosModel;

public class App {
    public static void main(String[] args) throws Exception {
        Model grupos = new Model();
        Model alumnos = new Model();
        UsuariosModel usuarios = new UsuariosModel();
        Usuario usu = (Usuario)usuarios.add(new Usuario("", "Juan", "García", "jgargom214@g.educaand.es", "1234"));
        Alumno alum = (Alumno)alumnos.add(new Alumno("", "Juan Antonio","García", ""));
        Grupo grupo = (Grupo) grupos.add(new Grupo("", "1ºESOA"));
        grupo.anadeAlumno(alum);
        List<Alumno> alumnosdelGrupo = grupo.getAlumnos();
        System.out.println(alumnosdelGrupo);
        System.out.println(usuarios.userExists(usu));
        System.out.println(usuarios.matchPassword("jgargom214@g.educaand.es", "1234"));
    }
}
