public class PanelLed implements Suscriptor{
    public PanelLed(EventBus eventBus){
        eventBus.suscribir(BebidaServidaEvent.class, this);
        eventBus.suscribir(ComidaPreparadaEvent.class, this);
        eventBus.suscribir(BandaTocandoEvent.class, this);
    }

    @Override
    public void onMessage(Event event){
        if (event instanceof BebidaServidaEvent bse) {
            System.out.println("[PANEL LED] !Nueva bebida servida en la mesa " + bse.getMesa_id());
        } else if (event instanceof ComidaPreparadaEvent cpe) {
            System.out.println("[PANEL LED] !Nueva comida lista del pedido " + cpe.getPedido_id());
        } else if (event instanceof BandaTocandoEvent bte) {
            System.out.println("[PANEL LED] !Banda tocando: " + bte.getNombre_banda() + " - " + bte.getNombre_cancion());
        }
    }
}
