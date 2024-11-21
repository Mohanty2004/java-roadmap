package threading;

class MyThreadRunnable implements Runnable {
    public void run() {
        System.out.println("I am runnable 1");
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        System.out.println("I am runnable 2");
    }
}

public class ThreadByRunnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread t1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread t2 = new Thread(bullet2);

        t1.start();
        t2.start();
    }
}
