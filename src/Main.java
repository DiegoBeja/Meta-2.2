import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventBus bus = new EventBus();

        // Suscriptores
        Barra barra = new Barra(bus);
        Cocina cocina = new Cocina(bus);
        PanelLed panel = new PanelLed(bus);
        SistemaDeSonido sonido = new SistemaDeSonido(bus);
        SistemaDeHumo humo = new SistemaDeHumo(bus);

        bus.suscribir(PedidoRealizadoEvent.class, barra);
        bus.suscribir(PedidoRealizadoEvent.class, cocina);
        bus.suscribir(BebidaServidaEvent.class, panel);
        bus.suscribir(ComidaPreparadaEvent.class, panel);
        bus.suscribir(BandaTocandoEvent.class, panel);
        bus.suscribir(BandaTocandoEvent.class, sonido);
        //La de humo
        bus.suscribir(BandaTocandoEvent.class, humo);

        // Pedido
        List<String> items = Arrays.asList("cerveza", "hamburguesa");
        bus.publicar(new PedidoRealizadoEvent("mesa_5", "pedido_123", items));

        // Banda tocando en paralelo
        //bus.publicar(new BandaTocandoEvent("Los Seguidores de Dijkstra", "El Algoritmo del Amor", 180));

        // Banda para el humo
        bus.publicar(new BandaTocandoEvent("Los Seguidores de Dijkstra", "Through the Fire and Flames", 180));

    }
}