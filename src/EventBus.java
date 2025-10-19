import java.util.*;

public class EventBus {
    private Map<Class<? extends Event>, Set<Suscriptor>> suscriptores = new HashMap<>();

    public EventBus(){

    }

    public void suscribir(Class<? extends Event> tipo, Suscriptor s) {
        suscriptores.computeIfAbsent(tipo, k -> new HashSet<>()).add(s);
    }


    public void publicar(Event e) {
        Set<Suscriptor> subs = suscriptores.getOrDefault(e.getClass(), Collections.emptySet());
        for (Suscriptor s : subs) {
            s.onMessage(e); // Notificación directa
        }
    }
}
