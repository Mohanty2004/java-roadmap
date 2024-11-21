package threading;

class MynewThr extends Thread {

    public void run() {
        int i = 0;
        while (i < 56546) {

            System.out.println("Thank you");
            i++;
        }
    }
}

class MynewThr2 extends Thread {

    public void run() {

        while (true) {

            System.out.println("Thank you!");
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MynewThr t1 = new MynewThr();
        MynewThr2 t2 = new MynewThr2();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}
