package cl.duoc.llanquihuetour.model;

public class Empleado extends Persona {

    private String nombre;
    private String cargo;
    private int sueldo;

    //CONSTRUCTORES
    public Empleado(String nombre, String rut, String email, String telefono, Direccion direccion, String nombre1, String cargo, double sueldo) {
        super(nombre, rut, email, telefono, direccion);
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = (int) sueldo;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " | ID Empleado: " + nombre + '\'' +
                " | Cargo='" + cargo + '\'' +
                " | Sueldo Base= $" + sueldo +
                '.';
    }
}
