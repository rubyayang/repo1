package chapter2;

public class TicketWindow extends Thread{

    //叫到的编号，共享index
    private static int index = 1;

    //柜台的名字
    private String name;

    //总的票数
    private final int MAX = 100;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index<MAX){
            System.out.println(name+"叫到编号"+index++);
        }
    }
}
