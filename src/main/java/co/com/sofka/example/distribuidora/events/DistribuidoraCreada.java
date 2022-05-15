package co.com.sofka.example.distribuidora.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.distribuidora.values.Nombre;

public class DistribuidoraCreada extends DomainEvent {

    private final Nombre nombre;
    public DistribuidoraCreada(Nombre nombre) {
        super("sofka.distribuidora.distribuidoracreada");

        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
