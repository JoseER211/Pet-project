package co.com.sofka.example.vehículo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.vehículo.values.Celular;
import co.com.sofka.example.vehículo.values.EncargadoId;
import co.com.sofka.example.vehículo.values.Horario;
import co.com.sofka.example.vehículo.values.Nombre;

public class EncargadoAgregado extends DomainEvent {
    private final EncargadoId encargadoId;
    private final Nombre nombre;
    private final Celular celular;
    private final Horario horario;

    public EncargadoAgregado(EncargadoId encargadoId, Nombre nombre, Celular celular, Horario horario) {
        super("sofka.vehículo.encargadoagregado");
        this.encargadoId = encargadoId;
        this.nombre = nombre;
        this.celular = celular;
        this.horario = horario;
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
