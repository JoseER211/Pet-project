package co.com.sofka.example.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.taller.values.Nombre;

public class TallerCreado extends DomainEvent {
    private final Nombre nombre;
    public TallerCreado(Nombre nombre) {
        super("sofka.taller.tallercreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
