package co.com.sofka.example.taller.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.example.vehículo.values.ClienteId;

public class EstaciónDeArregloId extends Identity {

    public EstaciónDeArregloId() {

    }

    private EstaciónDeArregloId(String id) {
        super(id);
    }

    public static EstaciónDeArregloId of(String id) {
        return new EstaciónDeArregloId(id);
    }
}
