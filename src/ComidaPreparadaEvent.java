public class ComidaPreparadaEvent implements Event{
    private String pedido_id;
    private String plato;

    public ComidaPreparadaEvent(String pedido_id, String plato){
        this.pedido_id = pedido_id;
        this.plato = plato;
    }

    public String getPedido_id() {
        return pedido_id;
    }

    public String getPlato() {
        return plato;
    }
}
