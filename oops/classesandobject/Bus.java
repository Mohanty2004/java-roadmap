package oops.classesandobject;

public class Bus {
    private String model;
    private boolean isEngineon;

    public Bus(String model) {
        this.model = model;
        this.isEngineon = false;
    }

    class Engine {
        void start() {
            if (!isEngineon) {
                isEngineon = true;
                System.out.println(model + " engine is started");
            } else {
                System.out.println(model + " engine is already on");
            }
        }

        void stop() {
            if (isEngineon) {
                isEngineon = false; // Fix: Stop means setting `isEngineon` to false
                System.out.println(model + " engine is stopped");
            } else {
                System.out.println(model + " engine is already off");
            }
        }
    }
}
