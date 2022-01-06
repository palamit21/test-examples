import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Remove {

  public static void main(String[] args) {
    /*const solveInput = (inputString) => {
  const tokens = inputString.split(' ')
    let result = []
    for (const token of tokens) {
      if (Number.isNaN(+token)) {
        switch (token) {
          case 'POP':
            result.pop();
            break;
          case 'DUP':
            result.push(result[result.length - 1]);
            break;
          case '+':
          {
            currentValue = result.pop()
            previousValue = result.pop()
            result.push(currentValue + previousValue)
            break;
          }
          case '-':
          {
            currentValue = result.pop()
            previousValue = result.pop()
            result.push(currentValue - previousValue)
            break;
          }
        }
      } else {
        result.push(+token)
      }
    }
    return result
  }

    console.log(solveInput('23 DUP 4 POP 5 DUP + DUP*/
   // '23 DUP 4 POP 5 DUP + DUP + -', "5 6 + -"
    //456-7+
    //"5 6 + -";
  String s="13 DUP 4 POP 5 DUP + DUP + ";
  String a[]=s.split("\\s+");;
   // System.out.println(Arrays.toString(a));
    ArrayList<Integer> result= new ArrayList<>();
  for(int i=0;i<a.length;i++){
    Integer currentValue = 0;
   Integer previousValue = 0;
    String token=a[i];
    switch (token) {

      case "POP":
        result.remove(result.size()-1);
        break;
      case "DUP":
        result.add(result.get(result.size() - 1));
       // result.push(result.get(result.size() - 1));
        break;
      case "+":
      {
        //currentValue = result.pop();
       // previousValue = result.pop();
        currentValue=result.get(result.size()-1);
        previousValue=result.get(result.size()-2);
        result.add(currentValue + previousValue);
        break;
      }
      case "-":
      {
        if(result.size()>1){
         // currentValue = result.pop();
          currentValue=result.get(result.size()-1);
        }
        if(result.size()>1){
          //previousValue = result.pop();
          previousValue=result.get(result.size()-2);

        }
        
        
        result.add(Integer.parseInt(String.valueOf(currentValue)) - Integer.parseInt(
            String.valueOf(previousValue)));
        break;
      }
      default:
        result.add(Integer.parseInt(token));

    }

  }
    //Integer sum = result.pop()+result.pop();
   /* System.out.println(result.pop());

    System.out.println(result.toString());*/
    if(result.size()==0){
      System.out.println(""+-1);

    }else {
      System.out.println(""+result.get(result.size()-1));


    }
  }

  public int getNo( String s){
   // String s="456-7+";
    char[] a =s.toCharArray();
    Stack<Integer>result= new Stack<>();
    for(int i=0;i<a.length-1;i++){
      Integer currentValue;
      Integer previousValue;
      String token=String.valueOf(a[i]);
      switch (token) {

        case "POP":
          result.pop();
          break;
        case "DUP":
          result.push(result.get(result.size() - 1));
          break;
        case "+":
        {
          currentValue = result.pop();
          previousValue = result.pop();
          result.push(currentValue + previousValue);
          break;
        }
        case "-":
        {
          currentValue = result.pop();
          previousValue = result.pop();
          result.push(Integer.parseInt(String.valueOf(currentValue)) - Integer.parseInt(
              String.valueOf(previousValue)));
          break;
        }
        default:
          result.push(Integer.parseInt(token));

      }

    }
    Integer sum = result.pop()+result.pop();

    System.out.println(result.toString());
    System.out.println(sum);
    return sum;
  }






}
