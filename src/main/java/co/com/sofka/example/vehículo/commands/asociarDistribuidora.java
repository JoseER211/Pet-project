package co.com.sofka.example.vehículo.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.distribuidora.values.DistribuidoraId;
import co.com.sofka.example.vehículo.values.VehículoId;

public class asociarDistribuidora extends Command {
    private final VehículoId vehículoId;
    private final DistribuidoraId distribuidoraId;

    public asociarDistribuidora(VehículoId vehículoId, DistribuidoraId distribuidoraId) {

        this.vehículoId = vehículoId;
        this.distribuidoraId = distribuidoraId;
    }

    public VehículoId getVehículoId() {
        return vehículoId;
    }

    public DistribuidoraId getDistribuidoraId() {
        return distribuidoraId;
    }
}
