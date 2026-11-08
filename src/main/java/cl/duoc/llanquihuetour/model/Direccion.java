package cl.duoc.llanquihuetour.model;

public class Direccion {

    private String calle;
    private String numero;
    private String comuna;
    private String region;

    //CONSTRUCTORES

    public Direccion(String calle, String numero, String comuna, String region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.region = region;
    }

    //GETTERS Y SETTERS
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Direccion: " +
                "Calle='" + calle + '\'' +
                ", Número='" + numero + '\'' +
                ", Comuna='" + comuna + '\'' +
                ", Región='" + region + '\'' +
                '.';
    }
}
