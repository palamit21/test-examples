import java.util.Arrays;

public class BaloonProblem {

    public static void main(String[] args) {
        String s= "0111887886";


        int count[]= new int[10];
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            int ch=s.indexOf(c);
            int v=count[ch];
            if(ch>=0) {
                count[ch]++;

            }
            //System.out.println(ch+"  "+v);



        }
        for (int j = 0; j < count.length; j++) {
            System.out.println(j+ "  "+count[j]);

        }



        System.out.println(Arrays.toString(count));



        }
    }

