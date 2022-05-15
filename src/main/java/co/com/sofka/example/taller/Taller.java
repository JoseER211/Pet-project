package co.com.sofka.example.taller;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.example.taller.events.EstaciónDeArregloAgregada;
import co.com.sofka.example.taller.events.MecánicoAgregado;
import co.com.sofka.example.taller.events.TallerCreado;
import co.com.sofka.example.taller.values.*;

import java.util.Set;

public class Taller extends AggregateEvent<TallerId> {

    protected Set<Mecánico> mecánicos;
    protected Set<EstaciónDeArreglo> estaciónesDeArreglo;
    protected Nombre nombre;


    public Taller(TallerId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new TallerCreado(nombre)).apply();
    }

    public void agregarMecánico(MecánicoId entityId, Nombre nombre, Celular celular){
        appendChange(new MecánicoAgregado(entityId, nombre, celular )).apply();

    }
    public void agregarEstaciónDeArreglo(EstaciónDeArregloId entityId, Arreglo arreglo, Ubicación ubicación){
        appendChange(new EstaciónDeArregloAgregada(entityId, arreglo, ubicación )).apply();
    }


}
