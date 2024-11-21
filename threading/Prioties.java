package threading;

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        while (true) {
            
        
        System.out.println("Thank you" + this.getName());
        }
    }
}

public class Prioties {
    public static void main(String[] args) {
        MyThr t1 = new MyThr(" mama");
        MyThr t2 = new MyThr(" richa");
        MyThr t3 = new MyThr(" pihu");
        MyThr t4 = new MyThr(" alia");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}