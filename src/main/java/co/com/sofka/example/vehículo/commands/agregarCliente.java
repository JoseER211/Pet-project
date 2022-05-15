package co.com.sofka.example.vehículo.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.vehículo.Vehículo;
import co.com.sofka.example.vehículo.values.ClienteId;
import co.com.sofka.example.vehículo.values.Contrato;
import co.com.sofka.example.vehículo.values.Nombre;
import co.com.sofka.example.vehículo.values.VehículoId;

public class agregarCliente extends Command {
    private final VehículoId vehículoId;
    private final ClienteId clienteId;
    private final Contrato contrato;
    private final Nombre nombre;

    public agregarCliente(VehículoId vehículoId, ClienteId clienteId, Contrato contrato, Nombre nombre) {
        this.vehículoId = vehículoId;
        this.clienteId = clienteId;
        this.contrato = contrato;
        this.nombre = nombre;
    }

    public VehículoId getVehículoId() {
        return vehículoId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
