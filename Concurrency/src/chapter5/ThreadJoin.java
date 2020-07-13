package chapter5;

import java.util.Date;

public class ThreadJoin {
    public static void main(String[] args) {
        Date beginTime = new Date();
        Thread t1 = new Thread(new Collection("m1", 10000));
        Thread t2 = new Thread(new Collection("m2", 15000));
        Thread t3 = new Thread(new Collection("m3", 20000));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("beginTime" +beginTime +"endTime"+new Date() );

    }

}

class Collection implements Runnable{
    private String machine;
    private int  spendTime;

    public Collection(String machine, int spendTime) {
        this.machine = machine;
        this.spendTime = spendTime;
    }

    @Override
    public void run() {
        try {
            System.out.println(machine +"beginTime-> "+new Date());
            Thread.sleep(spendTime);
            System.out.println(machine +"FinishTime-> "+new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
