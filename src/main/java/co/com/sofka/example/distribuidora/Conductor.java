package co.com.sofka.example.distribuidora;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.example.distribuidora.values.Celular;
import co.com.sofka.example.distribuidora.values.ConductorId;
import co.com.sofka.example.distribuidora.values.Nombre;

public class Conductor extends Entity<ConductorId> {

    private Nombre nombre;
    private Celular celular;

    public Conductor(ConductorId conductorId, Nombre nombre, Celular celular) {
        super(conductorId);
        this.nombre = nombre;
        this.celular = celular;
    }
    public void cambiarInformación(Nombre nombre, Celular celular){
        this.nombre = nombre;
        this.celular = celular;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }
}
