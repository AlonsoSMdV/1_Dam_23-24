package ecentro;

public class Usuario implements Comparable<Usuario>{
    private String id;
    private String nombre;
    private String apellidos;
    private String email;
    private String password;

    public Usuario(String id, String nombre, String apellidos, String email, String password){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        return this==obj || this.id == ((Usuario)obj).id;
    }

    @Override
    public int compareTo(Usuario o) {
        if(this.apellidos.equals(o.apellidos))
            return this.nombre.compareTo(o.nombre);
        return this.apellidos.compareTo(o.apellidos);
    }

    @Override
    public String toString() {
        return String.format("%s: %s, %s (%s)", this.id, this.apellidos, this.nombre, this.email);
    }
}
