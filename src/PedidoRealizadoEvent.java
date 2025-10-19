import java.util.List;

public class PedidoRealizadoEvent implements Event{
    private String mesa_id;
    private String pedido_id;
    private List<String> items;

    public PedidoRealizadoEvent(String mesa_id, String pedido_id, List<String> items){
        this.mesa_id = mesa_id;
        this.pedido_id = pedido_id;
        this.items = items;
    }

    public String getMesa_id() {
        return mesa_id;
    }

    public String getPedido_id() {
        return pedido_id;
    }

    public List<String> getItems() {
        return items;
    }
}
