package co.com.sofka.example.vehículo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.vehículo.values.*;

public class VehículoCreado extends DomainEvent {

    private final Matrícula matrícula;
    private final Marca marca;
    private final Modelo modelo;
    private final Color color;
    private final Documento documento;

    public VehículoCreado(Matrícula matrícula, Marca marca, Modelo modelo, Color color, Documento documento) {
        super("sofka.vehículo.vehículocreado");
        this.matrícula = matrícula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.documento = documento;
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
}
