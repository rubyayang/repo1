package chapter3;

public class CreateThread03 {
    private static int count = 0;

    public static void main(String[] args) {

        Thread thread = new Thread(null, new Runnable() {
            @Override
            public void run() {
                try {
                    add(0);
                } catch (Error e) {
                    System.out.println(count);
                }
            }

            public  void add(int i ){
                count++;
                add(i+1);
            }
        },"test",1<<24);

        thread.start();
    }

}
