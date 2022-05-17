package co.com.sofka.example.distribuidora.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.distribuidora.values.Cargamento;
import co.com.sofka.example.distribuidora.values.DistribuidoraId;
import co.com.sofka.example.distribuidora.values.TransporteId;
import co.com.sofka.example.distribuidora.values.Vehículo;

public class agregarTransporte extends Command {
    private final DistribuidoraId distribuidoraId;
    private final TransporteId transporteId;
    private final Vehículo vehículo;
    private final Cargamento cargamento;

    public agregarTransporte(DistribuidoraId distribuidoraId, TransporteId transporteId, Vehículo vehículo, Cargamento cargamento) {
        this.distribuidoraId = distribuidoraId;
        this.transporteId = transporteId;
        this.vehículo = vehículo;
        this.cargamento = cargamento;
    }

    public DistribuidoraId getDistribuidoraId() {
        return distribuidoraId;
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
