package co.com.sofka.example.vehículo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.distribuidora.values.DistribuidoraId;
import co.com.sofka.example.distribuidora.values.Nombre;

public class DistribuidoraAgregada extends DomainEvent {
    private final DistribuidoraId distribuidoraId;
    private final Nombre nombre;

    public DistribuidoraAgregada(DistribuidoraId distribuidoraId, Nombre nombre) {
        super("sofka.vehículo.distribuidoraagregada");
        this.distribuidoraId = distribuidoraId;
        this.nombre = nombre;
    }

    public DistribuidoraId getDistribuidoraId() {
        return distribuidoraId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
