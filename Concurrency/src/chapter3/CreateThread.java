package chapter3;

public class CreateThread {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        System.out.println(t1.getName());
        System.out.println(t2.getName());


        Thread t3 = new Thread("myThread");
        System.out.println(t3.getName());

        Thread t4 = new Thread(()->{
            System.out.println("Runnable...");
        });
        t4.start();

        Thread t5 = new Thread(()->{
            System.out.println("Runnable...");
        },"Runnable");

        System.out.println(t5.getName());
    }
}
