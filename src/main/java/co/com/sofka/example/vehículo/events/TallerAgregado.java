package co.com.sofka.example.vehículo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.taller.values.Nombre;
import co.com.sofka.example.taller.values.TallerId;

public class TallerAgregado extends DomainEvent {
    private final TallerId tallerId;
    private final Nombre nombre;

    public TallerAgregado(TallerId tallerId, Nombre nombre) {
        super("sofka.vehículo.talleragregado");
        this.tallerId = tallerId;
        this.nombre = nombre;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
