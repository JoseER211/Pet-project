package co.com.sofka.example.distribuidora;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.example.distribuidora.values.Cargamento;
import co.com.sofka.example.distribuidora.values.TransporteId;
import co.com.sofka.example.distribuidora.values.Vehículo;

public class Transporte extends Entity<TransporteId> {
    private Vehículo vehículo;
    private Cargamento cargamento;

    public Transporte(TransporteId entityId, Vehículo vehículo, Cargamento cargamento) {
        super(entityId);
        this.vehículo = vehículo;
        this.cargamento = cargamento;
    }

    public void cambiarInformación(Vehículo vehículo, Cargamento cargamento){
        this.vehículo = vehículo;
        this.cargamento = cargamento;
    }

    public Vehículo getVehículo() {
        return vehículo;
    }

    public Cargamento getCargamento() {
        return cargamento;
    }
}
