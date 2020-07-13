package chapter2;

public class TicketWindowRunnable implements Runnable {
    private final int MAX = 50;
    private int index = 1 ;
    @Override
    public void run() {

        while(index<MAX){
            System.out.println(Thread.currentThread().getName()+"叫号"+index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
