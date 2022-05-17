package co.com.sofka.example.taller.values;

import co.com.sofka.domain.generic.Identity;

public class MecánicoId extends Identity {

    public MecánicoId() {

    }

    private MecánicoId(String id) {
        super(id);
    }

    public static MecánicoId of(String id) {
        return new MecánicoId(id);
    }
}
