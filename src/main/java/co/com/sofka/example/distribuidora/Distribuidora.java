package co.com.sofka.example.distribuidora;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.distribuidora.events.ConductorAgregado;
import co.com.sofka.example.distribuidora.events.DistribuidoraCreada;
import co.com.sofka.example.distribuidora.events.TransporteAgregado;
import co.com.sofka.example.distribuidora.values.*;

import java.util.List;
import java.util.Set;

public class Distribuidora extends AggregateEvent<DistribuidoraId> {
    protected Set<Conductor> conductors;
    protected Set<Transporte> transportes;
    protected Nombre nombre;

    public Distribuidora(DistribuidoraId distribuidoraId, Nombre nombre) {
        super(distribuidoraId);
        appendChange(new DistribuidoraCreada(nombre)).apply();
    }

    private Distribuidora(DistribuidoraId distribuidoraId){
        super(distribuidoraId);
        subscribe(new DistribuidoraChange(this));

    }

    public static Distribuidora from(DistribuidoraId distribuidoraId, List<DomainEvent> events){
        var distribuidora = new Distribuidora(distribuidoraId);
        events.forEach(distribuidora::applyEvent);
        return distribuidora;
    }

    public void agregarConductor(ConductorId conductorId, Nombre nombre, Celular celular){
        appendChange(new ConductorAgregado(conductorId, nombre, celular )).apply();

    }

    public void agregarTransporte(TransporteId transporteId, Vehículo vehículo, Cargamento cargamento){
        appendChange(new TransporteAgregado(transporteId, vehículo, cargamento)).apply();

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
