public class BebidaServidaEvent implements Event{
    private String mesa_id;
    private String bebida;

    public BebidaServidaEvent(String mesa_id, String bebida){
        this.mesa_id = mesa_id;
        this.bebida = bebida;
    }

    public String getMesa_id() {
        return mesa_id;
    }

    public String getBebida() {
        return bebida;
    }
}
