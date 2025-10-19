public class Barra implements Suscriptor{
    private final EventBus bus;

    Barra(EventBus bus) {
        this.bus = bus;
    }

    @Override
    public void onMessage(Event event) {
        if (event instanceof PedidoRealizadoEvent pre && pre.getItems().contains("cerveza")) {
            System.out.println("Barra preparando bebida...");
            new Thread(() -> {
                try { Thread.sleep(2000); } catch (InterruptedException e) {}
                bus.publicar(new BebidaServidaEvent(pre.getMesa_id(), "cerveza"));
            }).start();
        }
    }
}
