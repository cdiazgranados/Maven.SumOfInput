import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Find the sum of 1 to the number you choose: ");
        int num = scan.nextInt();
        System.out.println(sumOfNumbers(num));
    }
    
    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
