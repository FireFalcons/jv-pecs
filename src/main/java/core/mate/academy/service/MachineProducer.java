package core.mate.academy.service;

import java.util.List;
import core.mate.academy.model.Machine;

public interface MachineProducer<M extends Machine> {
    
    List<M> get();
}
