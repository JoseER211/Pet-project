package co.com.sofka.example.taller;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.example.taller.values.Celular;
import co.com.sofka.example.taller.values.MecánicoId;
import co.com.sofka.example.taller.values.Nombre;

public class Mecánico extends Entity<MecánicoId> {
    private Nombre nombre;
    private Celular celular;

    public Mecánico(MecánicoId entityId, Nombre nombre, Celular celular) {
        super(entityId);
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
