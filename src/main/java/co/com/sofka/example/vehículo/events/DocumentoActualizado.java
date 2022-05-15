package co.com.sofka.example.vehículo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.vehículo.values.Documento;

public class DocumentoActualizado extends DomainEvent {
    private final Documento documento;

    public DocumentoActualizado(Documento documento) {
        super("sofka.vehículo.documentoactualizado");
        this.documento = documento;
    }

    public Documento getDocumento() {
        return documento;
    }
}
