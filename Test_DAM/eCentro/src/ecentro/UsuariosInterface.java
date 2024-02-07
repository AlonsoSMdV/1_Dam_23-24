package ecentro;

public interface UsuariosInterface {
  public boolean userExists(Usuario usuario);
  public boolean matchPassword(String email, String password);
}
