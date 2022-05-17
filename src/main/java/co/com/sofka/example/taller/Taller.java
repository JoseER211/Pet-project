package co.com.sofka.example.taller;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.taller.events.EstaciónDeArregloAgregada;
import co.com.sofka.example.taller.events.MecánicoAgregado;
import co.com.sofka.example.taller.events.TallerCreado;
import co.com.sofka.example.taller.values.*;

import java.util.List;
import java.util.Set;

public class Taller extends AggregateEvent<TallerId> {

    protected Set<Mecánico> mecánicos;
    protected Set<EstaciónDeArreglo> estaciónesDeArreglo;
    protected Nombre nombre;


    public Taller(TallerId tallerId, Nombre nombre) {
        super(tallerId);
        appendChange(new TallerCreado(nombre)).apply();
    }

    private Taller(TallerId tallerId){
        super(tallerId);
        subscribe(new TallerChange(this));
    }

    public static Taller from(TallerId tallerId, List<DomainEvent> events){
        var taller = new Taller(tallerId);
        events.forEach(taller::applyEvent);
        return taller;
    }

    public void agregarMecánico(MecánicoId mecánicoId, Nombre nombre, Celular celular){
        appendChange(new MecánicoAgregado(mecánicoId, nombre, celular )).apply();

    }
    public void agregarEstaciónDeArreglo(EstaciónDeArregloId estaciónDeArregloId, Arreglo arreglo, Ubicación ubicación){
        appendChange(new EstaciónDeArregloAgregada(estaciónDeArregloId, arreglo, ubicación )).apply();
    }

    public Set<Mecánico> getMecánicos() {
        return mecánicos;
    }

    public Set<EstaciónDeArreglo> getEstaciónesDeArreglo() {
        return estaciónesDeArreglo;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
