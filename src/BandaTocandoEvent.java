public class BandaTocandoEvent implements Event{
    private String nombre_banda;
    private String nombre_cancion;
    private int duracion;

    public BandaTocandoEvent(String nombre_banda, String nombre_cancion, int duracion) {
        this.nombre_banda = nombre_banda;
        this.nombre_cancion = nombre_cancion;
        this.duracion = duracion;
    }

    public String getNombre_banda() {
        return nombre_banda;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public int getDuracion() {
        return duracion;
    }
}
