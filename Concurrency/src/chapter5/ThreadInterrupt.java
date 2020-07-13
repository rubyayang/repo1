package chapter5;




public class ThreadInterrupt {

    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();
        System.out.println(t.isInterrupted());
        //打断线程
        t.interrupt();
        System.out.println(t.isInterrupted());;
    }
}
