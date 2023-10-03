import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {

        int numberofdigit;

        System.out.println(FibonacciList(25));

    }
    public static List<Integer> FibonacciList (int numberofdigit){
        List<Integer> fibonacciList = new ArrayList<>();
        if (numberofdigit==1){
            fibonacciList.add(0);
        }else if (numberofdigit==2){
            fibonacciList.add(0);
            fibonacciList.add(1);
        }else
            fibonacciList.add(0);
        fibonacciList.add(1);
        for (int i = 2; i < numberofdigit ; i++) {    //i burada sayının indexi
            fibonacciList.add((fibonacciList.get(i-1)+fibonacciList.get(i-2)));
        }

        return fibonacciList;


    }
}
