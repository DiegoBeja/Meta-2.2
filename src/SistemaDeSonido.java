public class SistemaDeSonido implements Suscriptor{

    public SistemaDeSonido(EventBus eventBus){
        eventBus.suscribir(BandaTocandoEvent.class, this);
    }

    @Override
    public void onMessage(Event event){
        if(event instanceof BandaTocandoEvent e){
            System.out.println("Ajustando ecualizador para: " + e.getNombre_cancion());
        }
    }
}
