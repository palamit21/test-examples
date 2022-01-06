import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuterTest {
    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(3);
        List<String>list= new ArrayList<>(Arrays.asList("1","2","3"));
       /*list.forEach(i->{
           e.submit(()->printNo(i));
       });*/
        e.submit(()->printNo(""));
        e.shutdown();
    }
    static void printNo(String input){
        for (int i=0;i<100;i++){
            System.out.println("Executing task (Thread name)- " + Thread.currentThread().getName());

            System.out.println(i);
        }

    }
}
