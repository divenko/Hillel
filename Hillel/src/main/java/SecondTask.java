import java.util.ArrayList;
import java.util.List;


public class SecondTask {


        public static void main(String Ar[]) {
            display(100);
        }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void display(int n) {
       List<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        for (int i = 3; i < n; i += 2) {
            if (isPrime(i)) {
                arr.add(i);
            }
        }
        System.out.println(arr);
    }


    }