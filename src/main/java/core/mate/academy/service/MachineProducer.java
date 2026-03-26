package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<M extends Machine> {
    
    List<M> get();
}
