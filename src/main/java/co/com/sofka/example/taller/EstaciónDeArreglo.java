package co.com.sofka.example.taller;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.example.taller.values.Arreglo;
import co.com.sofka.example.taller.values.EstaciónDeArregloId;
import co.com.sofka.example.taller.values.Ubicación;

public class EstaciónDeArreglo extends Entity<EstaciónDeArregloId> {
    private Arreglo arreglo;
    private Ubicación ubicación;

    public EstaciónDeArreglo(EstaciónDeArregloId estaciónDeArregloId, Arreglo arreglo, Ubicación ubicación) {
        super(estaciónDeArregloId);
        this.arreglo = arreglo;
        this.ubicación = ubicación;
    }


    public void cambiarInfomación(Arreglo arreglo, Ubicación ubicación){
        this.arreglo = arreglo;
        this.ubicación = ubicación;

    }

    public Arreglo getArreglo() {
        return arreglo;
    }

    public Ubicación getUbicación() {
        return ubicación;
    }
}
