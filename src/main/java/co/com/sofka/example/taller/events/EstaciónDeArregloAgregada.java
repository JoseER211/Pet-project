package co.com.sofka.example.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.taller.values.Arreglo;
import co.com.sofka.example.taller.values.EstaciónDeArregloId;
import co.com.sofka.example.taller.values.Ubicación;

public class EstaciónDeArregloAgregada  extends DomainEvent {
    private final EstaciónDeArregloId estaciónDeArregloId;
    private final Arreglo arreglo;
    private final Ubicación ubicación;
    public EstaciónDeArregloAgregada(EstaciónDeArregloId estaciónDeArregloId, Arreglo arreglo, Ubicación ubicación) {
        super("sofka.taller.estacióndearregloagregada");
        this.estaciónDeArregloId = estaciónDeArregloId;
        this.arreglo = arreglo;
        this.ubicación = ubicación;
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
