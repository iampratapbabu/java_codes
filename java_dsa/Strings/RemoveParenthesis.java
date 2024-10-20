package Strings;

import java.util.Arrays;

public class RemoveParenthesis {
    public static void main(String[] args){
       String mystr = "(()())(())(()(()))";

       int openCounter = 0;
       int closedCounter = 0;
       String res = "";
//      for(int i=0;i<mystr.length();i++){
//          int tempChar = mystr.charAt(i);
//        System.out.println(tempChar);
//      }

        for (char ch : mystr.toCharArray()) {
            if(ch == '(') {
                openCounter++;
            }else if(ch == ')' && openCounter >=2){
                res += "()";
                openCounter--;
            }else{
                openCounter--;
            }
        }

        System.out.println(res);

    }
}
