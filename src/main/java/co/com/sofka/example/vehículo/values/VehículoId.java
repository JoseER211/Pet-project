package co.com.sofka.example.vehículo.values;

import co.com.sofka.domain.generic.Identity;

public class VehículoId extends Identity {

    public VehículoId() {

    }

    private VehículoId(String id) {
        super(id);
    }

    public static VehículoId of(String id) {
        return new VehículoId(id);
    }
}
