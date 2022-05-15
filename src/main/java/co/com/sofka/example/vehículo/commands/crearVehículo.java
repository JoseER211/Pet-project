package co.com.sofka.example.vehículo.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.vehículo.values.*;

public class crearVehículo extends Command {
    private final VehículoId vehículoId;
    private final Matrícula matrícula;
    private final Marca marca;
    private final Modelo modelo;
    private final Color color;
    private final Documento documento;

    public crearVehículo(VehículoId vehículoId, Matrícula matrícula, Marca marca, Modelo modelo, Color color, Documento documento) {
        this.vehículoId = vehículoId;
        this.matrícula = matrícula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.documento = documento;
    }

    public VehículoId getVehículoId() {
        return vehículoId;
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
