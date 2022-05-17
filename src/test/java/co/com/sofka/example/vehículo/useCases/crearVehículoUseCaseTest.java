package co.com.sofka.example.vehículo.useCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.example.vehículo.Vehículo;
import co.com.sofka.example.vehículo.commands.crearVehículo;
import co.com.sofka.example.vehículo.events.VehículoCreado;
import co.com.sofka.example.vehículo.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class crearVehículoUseCaseTest {

    private crearVehículoUseCase crearVehículoUseCase;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        crearVehículoUseCase = new crearVehículoUseCase();
    }

    @Test
    public void crearVehículo(){
        VehículoId vehículoId = VehículoId.of("nfsmw");
        Matrícula matrícula = new Matrícula("ccc ccc");
        Marca marca = new Marca("Chevrolet");
        Modelo modelo = new Modelo("XRL8");
        Color color = new Color("Rojo");
        Documento documento = new Documento("Legalidad del auto");

        var command = new crearVehículo( vehículoId,  matrícula,  marca, modelo,  color, documento);

       var events = UseCaseHandler.getInstance()
               .syncExecutor(crearVehículoUseCase, new RequestCommand<>(command))
               .orElseThrow()
               .getDomainEvents();

        var vehículoCreado = (VehículoCreado) events.get(0);
        Assertions.assertEquals("nfsmw", vehículoCreado.aggregateRootId());
        Assertions.assertEquals("ccc ccc", vehículoCreado.getMatrícula().value());
        Assertions.assertEquals("Chevrolet", vehículoCreado.getMarca().value());
        Assertions.assertEquals("XRL8", vehículoCreado.getModelo().value());
        Assertions.assertEquals("Rojo", vehículoCreado.getColor().value());
        Assertions.assertEquals("Legalidad del auto", vehículoCreado.getDocumento().value());

    }
}