package oops.classesandobject;

public class Test {
    public static void main(String[] args) {
        Bus bus = new Bus("College Bus");
        Bus.Engine engine = bus.new Engine(); // Create an instance of the inner class

        engine.start(); // Start the engine
        engine.stop(); // Stop the engine
        engine.stop(); // Test engine stop when already off
    }
}
