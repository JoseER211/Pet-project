package co.com.sofka.example.taller.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Arreglo implements ValueObject<String> {

    private final String value;

    public Arreglo(String value) {
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
        Arreglo arreglo = (Arreglo) o;
        return Objects.equals(value, arreglo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
