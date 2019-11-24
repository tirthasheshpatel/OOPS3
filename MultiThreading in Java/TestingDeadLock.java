import java.util.*;

class A implements Runnable
{
    B b;

    A(B b) {
        this.b = b;
    }

    synchronized public void run() {
        System.out.println("In A::run().");
        this.b.last();
    }

    synchronized public void last() {
        System.out.println("In A::last().");
    }
}

class B implements Runnable
{
    A a;

    B(A a) {
        this.a = a;
    }

    synchronized public void run() {
        System.out.println("In B::run().");
        this.a.last();
    }

    synchronized public void last() {
        System.out.println("In B::last().");
    }
}

class TestingDeadLock
{
    public static void main(String[] args) {
        System.out.println("Main thread is: " + Thread.currentThread());
        Thread t1 = new Thread(new A(b));
    }
}