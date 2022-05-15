package co.com.sofka.example.vehículo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.vehículo.values.ClienteId;
import co.com.sofka.example.vehículo.values.Contrato;
import co.com.sofka.example.vehículo.values.Nombre;

public class ClienteAgregado extends DomainEvent {
    private final ClienteId clienteId;
    private final Contrato contrato;
    private final Nombre nombre;

    public ClienteAgregado(ClienteId clienteId, Contrato contrato, Nombre nombre) {
        super("sofka.vehículo.clienteagregado");
        this.clienteId = clienteId;
        this.contrato = contrato;
        this.nombre = nombre;
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
