import java.util.List;

public class SistemaDePedidos {
    private EventBus eventBus;

    public SistemaDePedidos(EventBus eventBus){
        this.eventBus = eventBus;
    }

    public void publicarPedido(String mesaId, String pedidoId, List<String> items){
        PedidoRealizadoEvent evento = new PedidoRealizadoEvent(mesaId, pedidoId, items);
        eventBus.publicar(evento);
    }
}
