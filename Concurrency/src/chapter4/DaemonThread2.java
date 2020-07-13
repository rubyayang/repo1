package chapter4;

public class DaemonThread2 {

    public static void main(String[] args) {


        Thread t = new Thread(()->{
           Thread innerThread = new Thread(()->{
               while (true){
                   System.out.println("Do some thing");
                   try {
                       Thread.sleep(1_000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           });

           //设置为守护线程,在start调用之前设置才能生效
           //innerThread.setDaemon(true);
           innerThread.start();

            try {
                System.out.println("t has start");
                Thread.sleep(1000);
                System.out.println("t done");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.setDaemon(true);
        t.start();

        try {
            System.out.println("main start");
            Thread.sleep(2000);
            System.out.println("main done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
