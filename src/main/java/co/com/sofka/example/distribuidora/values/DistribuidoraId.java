package co.com.sofka.example.distribuidora.values;

import co.com.sofka.domain.generic.Identity;

public class DistribuidoraId extends Identity {

    public DistribuidoraId() {

    }

    private DistribuidoraId(String id) {
        super(id);
    }

    public static DistribuidoraId of(String id) {
        return new DistribuidoraId(id);
    }
}
