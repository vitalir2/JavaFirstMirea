package ru.mirea.task28;

import java.util.Locale;

public abstract class Auto {
    private final Automaker automaker;
    private final Engine engine;

    protected Auto(Automaker automaker, Engine.EngineType type) {
        this.automaker = automaker;
        this.engine = new Engine(type);
    }

    public Automaker getAutomaker() {
        return automaker;
    }

    public Engine getEngine() {
        return engine;
    }

    abstract boolean isThereAnyProblems();

    final class Engine {
        private final EngineType type;

        Engine(EngineType type) {
            this.type = type;
        }

        public void start() {
            System.out.println("Starting " + type.name().toLowerCase(Locale.ROOT) + " engine");
        }

        enum EngineType {
            STEAM,
            ELECTRIC,
            INTERNAL_COMBUSTION
        }
    }
}

