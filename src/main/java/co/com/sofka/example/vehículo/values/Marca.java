package co.com.sofka.example.vehículo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Marca implements ValueObject<String> {

    private final String value;

    public Marca(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw  new IllegalArgumentException("La marca no puede estar vacía");
        }
        if (this.value.length() > 30){
            throw  new IllegalArgumentException("La marca no puede contener más de 20 carácteres");
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
        Marca marca = (Marca) o;
        return Objects.equals(value, marca.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
