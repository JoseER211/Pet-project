package co.com.sofka.example.taller.values;

import co.com.sofka.domain.generic.Identity;

public class TallerId extends Identity {

    public TallerId() {

    }

    private TallerId(String id) {
        super(id);
    }

    public static TallerId of(String id) {
        return new TallerId(id);
    }
}
