package chapter4;

public class ThreadApi {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
        });
        t.start();
        //让t线程先运行完再运行main线程的
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("error");
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
