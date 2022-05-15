package co.com.sofka.example.vehículo.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.vehículo.values.*;

public class agregarEncargado extends Command {
    private final VehículoId vehículoId;
    private final EncargadoId encargadoId;
    private final Nombre nombre;
    private final Celular celular;
    private final Horario horario;

    public agregarEncargado(VehículoId vehículoId, EncargadoId encargadoId, Nombre nombre, Celular celular, Horario horario) {
        this.vehículoId = vehículoId;
        this.encargadoId = encargadoId;
        this.nombre = nombre;
        this.celular = celular;
        this.horario = horario;
    }

    public VehículoId getVehículoId() {
        return vehículoId;
    }

    public EncargadoId getEncargadoId() {
        return encargadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }

    public Horario getHorario() {
        return horario;
    }
}

