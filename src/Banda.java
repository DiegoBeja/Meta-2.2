public class Banda{
    private EventBus eventBus;

    public Banda(EventBus eventBus){
        this.eventBus = eventBus;
    }

    public void tocarCancion(String nombreBanda, String cancion, int duracion){
        eventBus.publicar(new BandaTocandoEvent(nombreBanda, cancion, duracion));
    }
}
