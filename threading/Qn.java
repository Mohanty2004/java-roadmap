package threading;

class practiceQn extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

class practiceQn2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("good morning");
        }
    }
}

public class Qn {
    public static void main(String[] args) {

        practiceQn p1 = new practiceQn();
        practiceQn2 p2 = new practiceQn2();
        p1.start();
        p2.start();
    }
}
