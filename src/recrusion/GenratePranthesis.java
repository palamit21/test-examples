package recrusion;

import java.util.ArrayList;
import java.util.Vector;

public class GenratePranthesis {

  public static void main(String[] args) {
    int open=8;
    int close=8;
    ArrayList<String>list= new ArrayList<>();
    list=genratePrantesis(open,close,list);
    System.out.println(list);

  }

  private static ArrayList<String> genratePrantesis(int open, int close, ArrayList<String> list) {

   if(open==0&&close==0){
     return list;
   }else if(open>0){
     list.add("(");
    // list.add("{");
     genratePrantesis(open-1,close,list);

   }else if(close>0){
     list.add(")");
     //list.add("}");
     genratePrantesis(open,close-1,list);



   }
    //System.out.println(list);
    return list;
  }



}
