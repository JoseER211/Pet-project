package co.com.sofka.example.vehículo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.distribuidora.values.DistribuidoraId;
import co.com.sofka.example.distribuidora.values.Nombre;

public class DistribuidoraAsociada extends DomainEvent {
    private final DistribuidoraId distribuidoraId;


    public DistribuidoraAsociada(DistribuidoraId distribuidoraId) {
        super("sofka.vehículo.distribuidoraasociada");
        this.distribuidoraId = distribuidoraId;

    }

    public DistribuidoraId getDistribuidoraId() {
        return distribuidoraId;
    }


}
