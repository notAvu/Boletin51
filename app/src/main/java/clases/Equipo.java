package clases;

public class Equipo {
    private String nombre;
    private int idEscudo;

    public Equipo(String nombre, int idEscudo) {
        this.nombre = nombre;
        this.idEscudo = idEscudo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEscudo() {
        return idEscudo;
    }

    public void setIdEscudo(int idEscudo) {
        this.idEscudo = idEscudo;
    }
}
