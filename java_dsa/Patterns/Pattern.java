package Patterns;

public class Pattern {

    public static void pattern1(){
        for(int i=0;i<5;i++){
            //System.out.println("i value: "+i);
            for(int j=0;j<5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern2(){
        for(int i=0;i<5;i++){
            //System.out.println("i value: "+i);
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern3(){
        for(int i=0;i<5;i++){
            //System.out.println("i value: "+i);
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void pattern4(){
        for(int i=0;i<5;i++){
            //System.out.println("i value: "+i);
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void pattern5(){
        for(int i=5;i>0;i--){
            //System.out.println("i value: "+i);
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern6(){
        for(int i=5;i>0;i--){
            //System.out.println("i value: "+i);
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void pattern7(){
        for(int i=5;i>0;i--){
            //System.out.println("i value: "+i);
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
