package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MachineServiceImpl implements MachineService<Machine> {
    private Random random = new Random();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        int count = random.nextInt(10) + 1;

        if (type == Bulldozer.class) {
            return new ArrayList<>(new BulldozerProducerImpl().get(count));
        } else if (type == Truck.class) {
            return new ArrayList<>(new TruckProducerImpl().get(count));
        } else if (type == Excavator.class) {
            return new ArrayList<>(new ExcavatorProducerImpl().get(count));
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
