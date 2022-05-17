package co.com.sofka.example.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.taller.values.Arreglo;
import co.com.sofka.example.taller.values.EstaciónDeArregloId;
import co.com.sofka.example.taller.values.TallerId;
import co.com.sofka.example.taller.values.Ubicación;

public class agregarEstaciónDeArreglo extends Command {
    private final TallerId tallerId;
    private final EstaciónDeArregloId estaciónDeArregloId;
    private final Arreglo arreglo;
    private final Ubicación ubicación;

    public agregarEstaciónDeArreglo(TallerId tallerId, EstaciónDeArregloId estaciónDeArregloId, Arreglo arreglo, Ubicación ubicación) {
        this.tallerId = tallerId;
        this.estaciónDeArregloId = estaciónDeArregloId;
        this.arreglo = arreglo;
        this.ubicación = ubicación;


    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public EstaciónDeArregloId getEstaciónDeArregloId() {
        return estaciónDeArregloId;
    }

    public Arreglo getArreglo() {
        return arreglo;
    }

    public Ubicación getUbicación() {
        return ubicación;
    }

}
