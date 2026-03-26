package core.mate.academy.service;

import core.mate.academy.model.Colors;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Names;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private static final Colors[] VALUES_COLORS = Colors.values();
    private static final Names[] VALUES_NAMES = Names.values();
    private static final Random RANDOM = new Random();
    private static final int MAX_BLADE_WIDTH = 10;
    private static final int MIN_BLADE_WIDTH = 1;
    private static final int RANGE = MAX_BLADE_WIDTH - MIN_BLADE_WIDTH + 1;

    public Excavator createExcavator() {
        return new Excavator(randomBladeWidth(), randomName(), randomColor());
    }
    
    private String randomColor() {
        return VALUES_COLORS[RANDOM.nextInt(VALUES_COLORS.length)].name();
    }

    private String randomName() {
        return VALUES_NAMES[RANDOM.nextInt(VALUES_NAMES.length)].name();
    }

    private int randomBladeWidth() {
        return RANDOM.nextInt(RANGE) + MIN_BLADE_WIDTH;
    }

    @Override
    public List<Excavator> get(int count) {
        if (count < 1) {
            throw new IndexOutOfBoundsException("It is impossible to create so many machines.");
        }

        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            excavators.add(createExcavator());
        }
        
        return excavators;
    }
}
