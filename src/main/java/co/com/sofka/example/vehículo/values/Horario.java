package co.com.sofka.example.vehículo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalTime;
import java.util.Objects;

public class Horario implements ValueObject<LocalTime> {

    private final LocalTime value;

    public Horario(LocalTime value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public LocalTime value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return Objects.equals(value, horario.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
