package chapter1;

public class TemplateMethod {
    public final void print(String message){
        System.out.println("########");
        wrapPrint(message);
    }

    protected void wrapPrint(String message){

    }

    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod(){

            @Override
            protected void wrapPrint(String message) {
                System.out.println("*"+message+"*");
            }
        };

        t1.print("hello");

        TemplateMethod t2 = new TemplateMethod(){

            @Override
            protected void wrapPrint(String message) {
                System.out.println("#"+message+"#");
            }
        };

        t2.print("hello world");
    }
}
