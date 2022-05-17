package co.com.sofka.example.vehículo;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.example.vehículo.values.Celular;
import co.com.sofka.example.vehículo.values.EncargadoId;
import co.com.sofka.example.vehículo.values.Horario;
import co.com.sofka.example.vehículo.values.Nombre;

public class Encargado extends Entity<EncargadoId> {
    private Nombre nombre;
    private Celular celular;
    private Horario horario;

    public Encargado(EncargadoId encargadoId, Nombre nombre, Celular celular, Horario horario) {
        super(encargadoId);
        this.nombre = nombre;
        this.celular = celular;
        this.horario = horario;

    }

    public void cambiarInformación(Nombre nombre, Celular celular, Horario horario){
        this.nombre = nombre;
        this.celular = celular;
        this.horario = horario;
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
