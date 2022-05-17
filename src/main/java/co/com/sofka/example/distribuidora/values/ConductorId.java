package co.com.sofka.example.distribuidora.values;

import co.com.sofka.domain.generic.Identity;

public class ConductorId extends Identity {

    public ConductorId() {

    }

    private ConductorId(String id) {
        super(id);
    }

    public static ConductorId of(String id) {
        return new ConductorId(id);
    }
}
