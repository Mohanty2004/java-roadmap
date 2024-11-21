package threading;



class practiceQn2 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("good morning");
        }
    }
}
class practiceQn extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
           
            System.out.println("Welcome");
        }
    }
}

public class Qn {
    public static void main(String[] args) {

        practiceQn p1 = new practiceQn();
        p1.setPriority(6);
        practiceQn2 p2 = new practiceQn2();
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
        // p1.start();
        // p2.start();
    }
}
