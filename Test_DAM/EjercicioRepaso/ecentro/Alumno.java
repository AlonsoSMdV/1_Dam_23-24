package ecentro;

public class Alumno implements Comparable<Alumno>, Identifier{
    private String id;
    private String nombre;
    private String apellidos;
    private String grupoId;

    public Alumno(String id, String nombre, 
                  String apellidos, String grupoId){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.grupoId = grupoId;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGrupoId() {
        return grupoId;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || 
               this.id == ((Alumno)obj).id;
    }

    @Override
    public int compareTo(Alumno o) {
        if(this.apellidos.equals(o.apellidos))
            return this.nombre.compareTo(o.nombre);
        return this.apellidos.compareTo(o.apellidos);
    }

    @Override
    public String toString() {
        return String
                .format("%s: %s, %s (%s)", 
                 this.id, this.apellidos, 
                 this.nombre, this.grupoId);
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Identifier clone() {
        return (Identifier) new Alumno(id, nombre, apellidos, grupoId);
    }
    
}
