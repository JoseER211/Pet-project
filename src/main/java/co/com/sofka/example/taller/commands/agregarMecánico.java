package co.com.sofka.example.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.taller.values.Celular;
import co.com.sofka.example.taller.values.MecánicoId;
import co.com.sofka.example.taller.values.Nombre;
import co.com.sofka.example.taller.values.TallerId;

public class agregarMecánico extends Command {
    private final TallerId tallerId;
    private final MecánicoId mecánicoId;
    private final Nombre nombre;
    private final Celular celular;

    public agregarMecánico(TallerId tallerId, MecánicoId mecánicoId, Nombre nombre, Celular celular) {
        this.tallerId = tallerId;
        this.mecánicoId = mecánicoId;
        this.nombre = nombre;
        this.celular = celular;
    }

    public TallerId getTallerId() {
        return tallerId;
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
