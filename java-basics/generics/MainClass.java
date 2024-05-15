package generics;


public class MainClass {

    public static void main(String[] args){
        MyCustomList<String> slist = new MyCustomList<String>();
        slist.addElement("ele 1");
        slist.addElement("ele 2");

        MyCustomList<Integer> intlist = new MyCustomList<Integer>();
        intlist.addElement(1);
        intlist.addElement(2);

        System.out.println(slist.toString());
        System.out.println(intlist.toString());

        System.out.println(slist.getValue(0));
        System.out.println(intlist.getValue(0));

        
    }
}
