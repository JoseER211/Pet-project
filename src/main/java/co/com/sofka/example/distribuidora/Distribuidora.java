package co.com.sofka.example.distribuidora;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.example.distribuidora.events.ConductorAgregado;
import co.com.sofka.example.distribuidora.events.DistribuidoraCreada;
import co.com.sofka.example.distribuidora.events.TransporteAgregado;
import co.com.sofka.example.distribuidora.values.*;

import java.util.Set;

public class Distribuidora extends AggregateEvent<DistribuidoraId> {
    protected Set<Conductor> conductors;
    protected Set<Transporte> transportes;
    protected Nombre nombre;

    public Distribuidora(DistribuidoraId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new DistribuidoraCreada(nombre)).apply();
    }

    public void agregarConductor(ConductorId entityId, Nombre nombre, Celular celular){
        appendChange(new ConductorAgregado(entityId, nombre, celular )).apply();

    }

    public void agregarTransporte(TransporteId entityId, Vehículo vehículo, Cargamento cargamento){
        appendChange(new TransporteAgregado(entityId, vehículo, cargamento)).apply();

    }

    public Set<Conductor> getConductors() {
        return conductors;
    }

    public Set<Transporte> getTransportes() {
        return transportes;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
