package ecentro;

import java.util.HashMap;

public class UsuariosModel extends Model implements UsuariosInterface{
  private HashMap<String, String> users = new HashMap<String, String>();

  @Override
  public Identifier add(Identifier elem) {
    Usuario user = (Usuario) super.add(elem);
    users.put(user.getEmail(),user.getPassword());
    return user;
  }

  @Override
  public boolean userExists(Usuario usuario) {
    return users.containsKey(usuario.getEmail());
  }

  @Override
  public boolean matchPassword(String email, String password) {
    return users.get(email).equals(password);
  }

  
}
