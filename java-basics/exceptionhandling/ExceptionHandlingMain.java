package exceptionhandling;

public class ExceptionHandlingMain {

    public static void main(String[] args){
        System.out.println("exception handling fun started");  
        method1();
        System.out.println("main method ended");
    }

    private static void method1() {
        System.out.println("method 1 started");
        method2();
    }

    private static void method2() {
        try{
            String str = null;
            str.length();
            System.out.println("method 2 ended");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
