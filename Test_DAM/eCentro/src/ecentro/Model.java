package ecentro;

import java.util.HashMap;
import utils.MyUuid;
public class Model implements CRUD<Identifier>{
  private HashMap<String, Identifier> elems = new HashMap<String, Identifier>();

  @Override
  public Identifier add(Identifier elem) {
    String id = MyUuid.newUuid();
    while (elems.containsKey(id)) {
      id = MyUuid.newUuid();
    }
    Identifier newGrupo = elem.clone();
    newGrupo.setId(id);
    elems.put(id, newGrupo);
    return newGrupo;
  }

  @Override
  public Identifier[] query(String filter) {
    throw new UnsupportedOperationException("Unimplemented method 'query'");
  }

  @Override
  public Identifier get(String id) {
    return elems.get(id);
  }

  @Override
  public Identifier update(String id, Identifier data) {
    Identifier newGrupo = data.clone();
    newGrupo.setId(id);
    return elems.put(id, newGrupo);
  }

  @Override
  public Identifier delete(String id) {
    return elems.remove(id);
  }
}
