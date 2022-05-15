package co.com.sofka.example.vehículo.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.example.vehículo.values.Documento;
import co.com.sofka.example.vehículo.values.VehículoId;

public class actualizarDocumento extends Command {
    private final VehículoId vehículoId;
    private final Documento documento;

    public actualizarDocumento(VehículoId vehículoId, Documento documento) {
        this.vehículoId = vehículoId;
        this.documento = documento;
    }

    public VehículoId getVehículoId() {
        return vehículoId;
    }

    public Documento getDocumento() {
        return documento;
    }
}
