import java.util.*;
import java.io.*;

class Storage
{
    int a;
    boolean busy = false;
    String path;
    File file;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    BufferedWriter bw;

    Storage(String path) {
        this.path = path;
        try {
            this.file = new File(this.path);
            if(!this.file.exists()) this.file.createNewFile();
        }
        catch (Exception e) {}
    }

    synchronized public int getA() {
        try {
            while(!this.busy) wait();
            this.fr = new FileReader(this.file);
            this.br = new BufferedReader(this.fr);
            this.a = Integer.parseInt(this.br.readLine());
            this.br.close();
            this.fr.close();
            this.busy = false;
            notifyAll();
        }
        catch(Exception e) {}
        return this.a;
    }

    synchronized public void setA(int a) {
        try {
            while(this.busy) wait();
            this.fw = new FileWriter(this.file);
            this.bw = new BufferedWriter(this.fw);
            this.bw.write("" + a + "\n");
            this.bw.close();
            this.fw.close();
            this.busy = true;
            notifyAll();
        }
        catch(Exception e) {}
    }
}

class Producer implements Runnable 
{
    Storage s;
    Producer(Storage s) {
        this.s = s;
    }

    public void run() {
        int i=0;
        while(true) {
            this.s.setA(i++);
            try {Thread.sleep((int)(1000*Math.random()));}
            catch(Exception e) {}
        }
    }
}

class Consumer implements Runnable 
{
    Storage s;
    Consumer(Storage s) {
        this.s = s;
    }

    public void run() {
        while(true) {
            this.s.getA();
            try {Thread.sleep((int)(1000*Math.random()));}
            catch(Exception e) {}
        }
    }
}


class ProducerConsumer
{
    public static void main(String[] args) {
        Storage s = new Storage("../test_data/a.txt");
        Thread t1 = new Thread(new Producer(s));
        Thread t2 = new Thread(new Consumer(s));
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (Exception e) {}
    }
}