package ecentro;

import java.util.HashMap;

import utils.MyUuid;


public class Model implements CRUD<Identifier>{

    private HashMap<String, Identifier> grupos = new HashMap<String, Identifier>();

    @Override
    public Identifier add(Identifier elem) {
        String id = MyUuid.newUUID();
        while(grupos.containsKey(id))
            id = MyUuid.newUUID();
        
        Identifier newGrupo = elem.clone();
        newGrupo.setId(id);
        grupos.put(id,newGrupo);
        return newGrupo;
    }

    @Override
    public Identifier[] query(String filter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'query'");
    }

    @Override
    public Identifier get(String id) {
        return grupos.get(id);
    }

    @Override
    public Identifier update(String id, Identifier data) {
        Identifier newGrupo = data.clone();
        newGrupo.setId(id);
        return grupos.put(id, newGrupo);
    }

    @Override
    public Identifier delete(String id) {
        return grupos.remove(id);
    }
    
}
