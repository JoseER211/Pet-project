package co.com.sofka.example.vehículo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.example.distribuidora.values.DistribuidoraId;
import co.com.sofka.example.taller.events.TallerCreado;
import co.com.sofka.example.taller.values.TallerId;
import co.com.sofka.example.vehículo.events.*;
import co.com.sofka.example.vehículo.values.*;

import java.util.Objects;


public class Vehículo extends AggregateEvent<VehículoId> {

    protected Matrícula matrícula;
    protected Marca marca;
    protected Modelo modelo;
    protected Color color;
    protected Documento documento;
    protected Cliente cliente;
    protected Encargado encargado;
    protected TallerId tallerId;
    protected DistribuidoraId distribuidoraId;

    public Vehículo(VehículoId entityId, Matrícula matrícula, Marca marca, Modelo modelo, Color color, Documento documento) {
        super(entityId);
        appendChange(new VehículoCreado(matrícula, marca, modelo, color, documento)).apply();
    }


    public void actualizarDocumento(Documento documento){
        appendChange(new DocumentoActualizado(documento)).apply();

    }

    public void agregarCliente(ClienteId entityId, Contrato contrato, Nombre nombre){
        appendChange(new ClienteAgregado(entityId, contrato, nombre )).apply();

    }

    public void agregarEncargado(EncargadoId entityId, Nombre nombre, Celular celular, Horario horario){
        appendChange(new EncargadoAgregado(entityId, nombre, celular, horario)).apply();

    }

    public void agregarTaller(TallerId tallerId, co.com.sofka.example.taller.values.Nombre nombre){
        appendChange(new TallerAgregado(tallerId, nombre)).apply();
    }

    public void agregarDistribuidora(DistribuidoraId distribuidoraId, co.com.sofka.example.distribuidora.values.Nombre nombre){
        appendChange(new DistribuidoraAgregada(distribuidoraId, nombre)).apply();
    }



}
