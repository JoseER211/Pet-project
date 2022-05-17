package co.com.sofka.example.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.taller.values.Nombre;
import co.com.sofka.example.taller.values.TallerId;

public class CrearTaller extends Command {
    private final TallerId tallerId;
    private final Nombre nombre;

    public CrearTaller(TallerId tallerId, Nombre nombre) {
        this.tallerId = tallerId;
        this.nombre = nombre;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
