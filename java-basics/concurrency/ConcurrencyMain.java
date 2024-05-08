package concurrency;

public class ConcurrencyMain {
    public static  void main(String[] args){
        System.out.println("Concurrency started");

        //Task1
        for(int i=101;i<=199;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n Task 1 Done");

        //Task2
        for(int i=201;i<=299;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n Task 2 Done");


        //Task3
        for(int i=301;i<=399;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n Task 3 Done");

        System.out.print("\n Main Method Done");


    }

}
