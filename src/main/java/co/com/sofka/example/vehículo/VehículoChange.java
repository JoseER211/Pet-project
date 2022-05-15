package co.com.sofka.example.vehículo;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.example.vehículo.events.*;

public class VehículoChange extends EventChange {
    public VehículoChange(Vehículo vehículo) {

        apply((VehículoCreado event) -> {
            vehículo.matrícula = event.getMatrícula();
            vehículo.marca = event.getMarca();
            vehículo.modelo = event.getModelo();
            vehículo.color = event.getColor();
            vehículo.documento = event.getDocumento();

        });

        apply((DocumentoActualizado event) -> vehículo.documento = event.getDocumento());

        apply((ClienteAgregado event) -> vehículo.cliente = new Cliente(
                event.getClienteId(), event.getContrato(), event.getNombre()));


        apply((EncargadoAgregado event) -> vehículo.encargado = new Encargado(
                event.getEncargadoId(), event.getNombre(), event.getCelular(), event.getHorario()
        ));

        apply((TallerAsociado event) -> vehículo.tallerId = event.getTallerId()
        );

        apply((DistribuidoraAsociada event) -> vehículo.distribuidoraId = event.getDistribuidoraId());
    }

}
