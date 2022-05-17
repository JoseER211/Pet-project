package co.com.sofka.example.vehículo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.distribuidora.values.DistribuidoraId;
import co.com.sofka.example.taller.events.TallerCreado;
import co.com.sofka.example.taller.values.TallerId;
import co.com.sofka.example.vehículo.events.*;
import co.com.sofka.example.vehículo.values.*;

import java.util.List;
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

    public Vehículo(VehículoId vehículoId, Matrícula matrícula, Marca marca, Modelo modelo, Color color, Documento documento) {
        super(vehículoId);
        appendChange(new VehículoCreado(matrícula, marca, modelo, color, documento)).apply();
    }

    private Vehículo(VehículoId vehículoId){
        super(vehículoId);
        subscribe(new VehículoChange(this));
    }

    public static Vehículo from(VehículoId vehículoId, List<DomainEvent> events){
        var vehículo = new Vehículo(vehículoId);
        events.forEach(vehículo::applyEvent);
        return vehículo;
    }


    public void actualizarDocumento(Documento documento){
        appendChange(new DocumentoActualizado(documento)).apply();

    }

    public void agregarCliente(ClienteId clienteId, Contrato contrato, Nombre nombre){
        appendChange(new ClienteAgregado(clienteId, contrato, nombre )).apply();

    }

    public void agregarEncargado(EncargadoId encargadoId, Nombre nombre, Celular celular, Horario horario){
        appendChange(new EncargadoAgregado(encargadoId, nombre, celular, horario)).apply();

    }

    public void asociarTaller(TallerId tallerId){
        appendChange(new TallerAsociado(tallerId)).apply();
    }

    public void asociarDistribuidora(DistribuidoraId distribuidoraId){
        appendChange(new DistribuidoraAsociada(distribuidoraId)).apply();
    }


    public Matrícula getMatrícula() {
        return matrícula;
    }

    public Marca getMarca() {
        return marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public DistribuidoraId getDistribuidoraId() {
        return distribuidoraId;
    }
}
