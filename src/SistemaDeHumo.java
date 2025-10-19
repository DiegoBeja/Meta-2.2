import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SistemaDeHumo implements Suscriptor{
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    public SistemaDeHumo(EventBus bus){
        bus.suscribir(BandaTocandoEvent.class,this);
    }

    @Override
    public void onMessage(Event event) {
        if (event instanceof BandaTocandoEvent bte) {
            if (bte.getNombre_cancion().equals("Through the Fire and Flames")) {
                System.out.println("[SISTEMA DE HUMO] Preparando humo para: " + bte.getNombre_cancion());
                scheduler.schedule(() -> {
                    System.out.println("[SISTEMA DE HUMO] Humo activado 🎉🔥");
                    scheduler.shutdown();
                }, 1, TimeUnit.SECONDS);
            }
        }
    }
}
