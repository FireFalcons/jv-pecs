package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Colors;
import core.mate.academy.model.Names;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private static final Colors[] VALUES_COLORS = Colors.values();
    private static final Names[] VALUES_NAMES = Names.values();
    private static final Random RANDOM = new Random();
    private static final int MAX_BLADE_WIDTH = 10;
    private static final int MIN_BLADE_WIDTH = 1;
    private static final int RANGE = MAX_BLADE_WIDTH - MIN_BLADE_WIDTH + 1;

    public Bulldozer createBulldozer() {
        return new Bulldozer(randomBladeWidth(), randomName(), randomColor());
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
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(createBulldozer());
        return bulldozers;
    }
}
