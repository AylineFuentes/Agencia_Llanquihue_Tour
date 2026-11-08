package cl.duoc.llanquihuetour.model;

public class Persona {

    private String nombre;
    private String rut;
    private String email;
    private String telefono;
    private Direccion direccion;

    //CONSTRUCTORES


    public Persona(String nombre, String rut, String email, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "° " +
                "Nombre= '" + nombre + '\'' +
                " | RUT= '" + rut + '\'' +
                " | Email= '" + email + '\'' +
                " | Telefono= '" + telefono + '\'' +
                " | " + direccion;
    }
}
