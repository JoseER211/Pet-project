package co.com.sofka.example.distribuidora.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.distribuidora.values.Celular;
import co.com.sofka.example.distribuidora.values.ConductorId;
import co.com.sofka.example.distribuidora.values.Nombre;

public class ConductorAgregado extends DomainEvent {

    private final ConductorId conductorId;
    private final Nombre nombre;
    private final Celular celular;
    public ConductorAgregado(ConductorId conductorId, Nombre nombre, Celular celular) {
        super("sofka.distribuidora.conductoragregado");
        this.conductorId = conductorId;
        this.nombre = nombre;
        this.celular = celular;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }
}
