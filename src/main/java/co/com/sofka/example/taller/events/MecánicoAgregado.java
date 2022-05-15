package co.com.sofka.example.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.taller.values.Celular;
import co.com.sofka.example.taller.values.MecánicoId;
import co.com.sofka.example.taller.values.Nombre;

public class MecánicoAgregado extends DomainEvent {

    private final MecánicoId mecánicoId;
    private final Nombre nombre;
    private final Celular celular;
    public MecánicoAgregado(MecánicoId mecánicoId, Nombre nombre, Celular celular) {
        super("sofka.taller.mecánicoagregado");
        this.mecánicoId = mecánicoId;
        this.nombre = nombre;
        this.celular = celular;

    }

    public MecánicoId getMecánicoId() {
        return mecánicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }
}
