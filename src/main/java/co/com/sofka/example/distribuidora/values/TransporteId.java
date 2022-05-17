package co.com.sofka.example.distribuidora.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.example.taller.values.TallerId;

public class TransporteId extends Identity {


    public TransporteId() {

    }

    private TransporteId(String id) {
        super(id);
    }

    public static TransporteId of(String id) {
        return new TransporteId(id);
    }
}
