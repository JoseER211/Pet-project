package co.com.sofka.example.distribuidora.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.distribuidora.values.Celular;
import co.com.sofka.example.distribuidora.values.ConductorId;
import co.com.sofka.example.distribuidora.values.DistribuidoraId;
import co.com.sofka.example.distribuidora.values.Nombre;

public class agregarConductor extends Command {
    private final DistribuidoraId distribuidoraId;
    private final ConductorId conductorId;
    private final Nombre nombre;
    private final Celular celular;

    public agregarConductor(DistribuidoraId distribuidoraId, ConductorId conductorId, Nombre nombre, Celular celular) {
        this.distribuidoraId = distribuidoraId;
        this.conductorId = conductorId;
        this.nombre = nombre;
        this.celular = celular;
    }

    public DistribuidoraId getDistribuidoraId() {
        return distribuidoraId;
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
