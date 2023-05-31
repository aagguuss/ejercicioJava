package entidades;



import java.util.List;

public class Cine {
    
    private Asiento sala[][];
    private List<String> asientosLibres;
    private pelicula pelicula;
    private Integer precio;

    public Cine() {
    }

    public Cine(Asiento[][] sala, List<String> asientosLibres, pelicula pelicula, Integer precio) {
        this.sala = sala;
        this.asientosLibres = asientosLibres;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public List<String> getAsientosLibres() {
        return asientosLibres;
    }

    public pelicula getPelicula() {
        return pelicula;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public void setAsientosLibres(List<String> asientosLibres) {
        this.asientosLibres = asientosLibres;
    }

    public void setPelicula(pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

}