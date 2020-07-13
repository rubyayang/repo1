package chapter1;


public class TryConcurrency {
    public static void main(String[] args) {
        Thread thread = new Thread();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.println("t1  "+i);
                    try {
                        thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main  "+i);
        }
    }
}
