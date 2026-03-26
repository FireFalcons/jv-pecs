package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<M extends Machine> {

    List<M> getAll(Class<? extends M> type);

    void fill(List<? super M> machines, M value);

    void startWorking(List<? extends M> machines);
}
