package chapter3;

public class CreateThread2 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //如果构造函数没有闯入线程组的名字，默认用父类的线程名字
        System.out.println(t.getThreadGroup().getName());
        //main线程的线程组
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();

        System.out.println(threadGroup.getName());

        //查看有多少个正在活动的线程
        t.start();
        System.out.println(threadGroup.activeCount());
        Thread[] threads = new Thread[threadGroup.activeCount()];
        Thread.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println(thread);
        }

    }
}
