package co.com.sofka.example.vehículo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.taller.values.Nombre;
import co.com.sofka.example.taller.values.TallerId;

public class TallerAsociado extends DomainEvent {
    private final TallerId tallerId;

    public TallerAsociado(TallerId tallerId) {
        super("sofka.vehículo.tallerasociado");
        this.tallerId = tallerId;

    }

    public TallerId getTallerId() {
        return tallerId;
    }

}
