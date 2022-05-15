package co.com.sofka.example.vehículo.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.taller.values.TallerId;
import co.com.sofka.example.vehículo.values.VehículoId;

public class asociarTaller extends Command {
    private final VehículoId vehículoId;
    private final TallerId tallerId;

    public asociarTaller(VehículoId vehículoId, TallerId tallerId) {
        this.vehículoId = vehículoId;
        this.tallerId = tallerId;
    }

    public VehículoId getVehículoId() {
        return vehículoId;
    }

    public TallerId getTallerId() {
        return tallerId;
    }
}
