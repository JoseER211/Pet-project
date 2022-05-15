package co.com.sofka.example.distribuidora.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.distribuidora.values.Cargamento;
import co.com.sofka.example.distribuidora.values.TransporteId;
import co.com.sofka.example.distribuidora.values.Vehículo;


public class TransporteAgregado extends DomainEvent {
    private final TransporteId transporteId;
    private final Vehículo vehículo;
    private final Cargamento cargamento;

    public TransporteAgregado(TransporteId transporteId, Vehículo vehículo, Cargamento cargamento) {
        super("sofka.distribuidora.transporteagregado");
        this.transporteId = transporteId;
        this.vehículo = vehículo;
        this.cargamento = cargamento;

    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public Vehículo getVehículo() {
        return vehículo;
    }

    public Cargamento getCargamento() {
        return cargamento;
    }
}
