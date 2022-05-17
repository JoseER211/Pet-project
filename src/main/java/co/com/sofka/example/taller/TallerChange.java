package co.com.sofka.example.taller;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.example.taller.events.EstaciónDeArregloAgregada;
import co.com.sofka.example.taller.events.MecánicoAgregado;
import co.com.sofka.example.taller.events.TallerCreado;

public class TallerChange extends EventChange {

    public TallerChange(Taller taller) {

        apply((TallerCreado event) -> taller.nombre = event.getNombre());

        apply((MecánicoAgregado event) -> taller.mecánicos.add(new Mecánico(
                event.getMecánicoId(),
                event.getNombre(),
                event.getCelular()
        )));

        apply((EstaciónDeArregloAgregada event)->
                taller.estaciónesDeArreglo.add(new EstaciónDeArreglo(
                        event.getEstaciónDeArregloId(),
                        event.getArreglo(),
                        event.getUbicación()
                ))
                );
    }
}
