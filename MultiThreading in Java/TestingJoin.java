import java.util.*;

class A implements Runnable
{
    void callMe() {
        System.out.println("In method A::callMe.");
    }

    public void run() {
        callMe();
        System.out.println("Ending execution of class A.");
    }
}

class B implements Runnable
{
    void callMe() {
        // for(int i=0;i<120000;i++){}
        System.out.println("In method B::callMe.");
    }

    public void run() {
        callMe();
        for(int i=0;i<12000000;i++){for(int j=0;j<12000000;j++){}}
        System.out.println("Ending execution of class B.");
    }
}

class TestingJoin
{
    public static void main(String[] args) {
        System.out.println("Main thread is: " + Thread.currentThread());
        Thread t1 = new Thread(new A(), "God");
        Thread t2 = new Thread(new B(), "Satan");

        System.out.println("Thread A: " + t1); // god
        System.out.println("Thread B: " + t2); // satan

        System.out.println("Life status of t1: " + t1.isAlive()); // must be false as the execution of
        System.out.println("Life status of t2: " + t2.isAlive()); // run hasn't started yet...!!!

        t1.start(); // here the thread t1 comes to life!!
        t2.start(); // here the thread t2 comes to life!!

        System.out.println("Life status of t1: " + t1.isAlive()); // true
        System.out.println("Life status of t2: " + t2.isAlive()); // true

        try {Thread.sleep(1000);} // lets wait for both the threads to complete their run method...
        catch(Exception e) {}

        System.out.println("Life status of t1: " + t1.isAlive()); // now, as the execution of run() is over,
        System.out.println("Life status of t2: " + t2.isAlive()); // the threads would be dead... RIP

        try {
            System.out.println("Ending execution of t2.");
            t2.join(); // This is a blocking line until the thread t2 completes its execution!
            System.out.println("Blocked by t2.join().");
            System.out.println("Ending execution of t1.");
            t1.join();
            System.out.println("Blocked by t1.join().");
        }
        catch(Exception e) {
            System.out.println("Interupted!");
        }
    }
}