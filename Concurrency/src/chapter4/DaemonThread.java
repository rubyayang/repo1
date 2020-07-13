package chapter4;


public class DaemonThread {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"running");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("error");
                }
            }
        });

        //将t线程设置为守护线程，main线程结束后一起结束
        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());

    }
}
