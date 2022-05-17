package co.com.sofka.example.vehículo.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.example.vehículo.Vehículo;
import co.com.sofka.example.vehículo.commands.crearVehículo;

public class crearVehículoUseCase extends UseCase<RequestCommand<crearVehículo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<crearVehículo> crearVehículoRequestCommand) {
        var command = crearVehículoRequestCommand.getCommand();

        var vehículo = new Vehículo(command.getVehículoId(), command.getMatrícula(), command.getMarca(),
                command.getModelo(), command.getColor(), command.getDocumento());

        emit().onResponse(new ResponseEvents(vehículo.getUncommittedChanges()));
    }

}
