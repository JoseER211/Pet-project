package co.com.sofka.example.vehículo;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.example.vehículo.values.*;

import java.util.Objects;


public class Cliente extends Entity<ClienteId> {
    private  Contrato contrato;
    private  Nombre nombre;

    public Cliente(ClienteId clienteId, Contrato contrato, Nombre nombre) {
        super(clienteId);
        this.contrato = contrato;
        this.nombre = nombre;
    }

    public void cambiarInformación(Nombre nombre, Contrato contrato){
        this.nombre = nombre;
        this.contrato = contrato;
    }

    public void actualizarContrato(Contrato contrato){
        this.contrato = Objects.requireNonNull(contrato);
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

