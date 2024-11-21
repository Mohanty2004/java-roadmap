package threading;

class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {

            System.out.println("my thread is running.");
            System.out.println("I am happy.");
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i=0;
        while (i<40) {

            System.out.println("my thread1 is running.");
            System.out.println("I am sad.");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i=0;
        while (i<40) {

            System.out.println("my thread2 is running.");
            System.out.println("I am happy.");
            i++;
        }
    }
}

public class ThreadExtend {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }

}
