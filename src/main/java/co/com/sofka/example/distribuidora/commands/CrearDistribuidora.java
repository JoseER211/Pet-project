package co.com.sofka.example.distribuidora.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.distribuidora.values.DistribuidoraId;
import co.com.sofka.example.distribuidora.values.Nombre;

public class CrearDistribuidora extends Command {
    private final DistribuidoraId distribuidoraId;
    private final Nombre nombre;

    public CrearDistribuidora(DistribuidoraId distribuidoraId, Nombre nombre) {
        this.distribuidoraId = distribuidoraId;
        this.nombre = nombre;
    }

    public DistribuidoraId getDistribuidoraId() {
        return distribuidoraId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
