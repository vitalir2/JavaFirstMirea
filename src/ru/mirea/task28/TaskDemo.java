package ru.mirea.task28;

public class TaskDemo {
    public static void main(String[] args) {
        Auto brokenAuto = new Auto(Automaker.NISSAN, Auto.Engine.EngineType.INTERNAL_COMBUSTION) {
            @Override
            boolean isThereAnyProblems() {
                System.out.println("Front glass is broken");
                return true;
            }
        };
        brokenAuto.isThereAnyProblems();
        brokenAuto.getEngine().start();

        Auto simpleAuto = new Auto(Automaker.BMW, Auto.Engine.EngineType.ELECTRIC) {
            @Override
            boolean isThereAnyProblems() {
                System.out.println("Everything is ok");
                return false;
            }
        };
        simpleAuto.isThereAnyProblems();
        simpleAuto.getEngine().start();
    }
}
