package co.com.sofka.example.distribuidora.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cargamento implements ValueObject<String> {

    private final String value;

    public Cargamento(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cargamento that = (Cargamento) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
