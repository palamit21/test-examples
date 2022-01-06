import java.util.ArrayList;
import java.util.List;

public class StringTest01 {
    public static void main(String[] args) {
       int a[][] = { {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}};
       int top=0, bottom=0,rows=a.length,col=a[0].length;
       int dir=1;
       for (int i=0;i<col;i++){
           System.out.print(a[top][i]);
           //top=1;

       }
        for (int i = col-1; i >0; i--) {
            System.out.print(a[1][i]);

        }


    }
}
