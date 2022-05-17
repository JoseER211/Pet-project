package co.com.sofka.example.vehículo.values;

import co.com.sofka.domain.generic.Identity;

public class EncargadoId extends Identity {
    public EncargadoId() {

    }

    private EncargadoId(String id) {
        super(id);
    }

    public static EncargadoId of(String id) {
        return new EncargadoId(id);
    }
}
