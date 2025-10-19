public class Cocina implements Suscriptor{
    private EventBus bus;

    public Cocina(EventBus bus){
        this.bus = bus;
    }

    @Override
    public void onMessage(Event event) {
        if (event instanceof PedidoRealizadoEvent pre && pre.getItems().contains("hamburguesa")) {
            System.out.println("Cocina preparando comida...");
            new Thread(() -> {
                try { Thread.sleep(5000); } catch (InterruptedException e) {}
                bus.publicar(new ComidaPreparadaEvent(pre.getPedido_id(), "hamburguesa"));
            }).start();
        }
    }
}
