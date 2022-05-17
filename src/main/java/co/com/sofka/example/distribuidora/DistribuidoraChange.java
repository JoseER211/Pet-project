package co.com.sofka.example.distribuidora;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.example.distribuidora.events.ConductorAgregado;
import co.com.sofka.example.distribuidora.events.DistribuidoraCreada;
import co.com.sofka.example.distribuidora.events.TransporteAgregado;

public class DistribuidoraChange extends EventChange {
    public DistribuidoraChange(Distribuidora distribuidora) {
        apply((DistribuidoraCreada event) ->
                distribuidora.nombre = event.getNombre());

        apply((ConductorAgregado event) -> distribuidora.conductors.add( new Conductor(
                    event.getConductorId(),
                    event.getNombre(),
                    event.getCelular()
        )));

        apply((TransporteAgregado event) -> distribuidora.transportes.add(new Transporte(
                event.getTransporteId(),
                event.getVehículo(),
                event.getCargamento()
        )));
    }

}
