package co.com.sofka.example.vehículo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalTime;

public class Horario implements ValueObject<LocalTime> {
    @Override
    public LocalTime value() {
        return null;
    }
}
