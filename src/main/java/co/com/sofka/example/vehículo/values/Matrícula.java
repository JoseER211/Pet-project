package co.com.sofka.example.vehículo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


public class Matrícula implements ValueObject<String> {
    private final String value;

    public Matrícula(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw  new IllegalArgumentException("La matrícula no puede estar vacía");
        }
        if (this.value.length() > 30){
            throw  new IllegalArgumentException("La matrícula no puede contener más de 8 carácteres");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrícula matrícula = (Matrícula) o;
        return Objects.equals(value, matrícula.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
