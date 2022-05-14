package co.com.sofka.example.vehículo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.example.vehículo.values.*;



public class Vehículo extends AggregateEvent<VehículoId> {

    public Vehículo(VehículoId entityId, Matrícula matrícula, Marca marca, Modelo modelo, Color color, Documento documento) {
        super(entityId);
    }
}
