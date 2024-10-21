package Strings;

import java.util.Arrays;
import java.util.StringJoiner;

public class RemoveParenthesis {
    public static void main(String[] args){
       String mystr = "(()())(())(()(()))";

       int openCounter = 0;
       String str = "";
        StringJoiner sj = new StringJoiner("");
//      for(int i=0;i<mystr.length();i++){
//          int tempChar = mystr.charAt(i);
//        System.out.println(tempChar);
//      }

        for (char ch : mystr.toCharArray()) {
            if(ch == '('){
                if(openCounter > 0){
                    str  = str+ch;
                }
                openCounter++;
            }else{
                openCounter--;
                if(openCounter > 0){
                    str  = str+ch;
                }
            }
        }

        System.out.println(str);

    }
}
