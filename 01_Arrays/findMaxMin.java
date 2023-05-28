import java.util.*;
public class findMaxMin{
    public static void main(String args[]) {
    
    //Question 2
        //To find maximum and minimum in array of integers
        int numbers[]= {20,67,4,7,30,89,45,98,23,96};
        int j=0;
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i]>=j) {
                j=numbers[i];
            }
        }
        System.out.println("The maximum number in the array is:"+j);
        int k=numbers[0];
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i]<=k) {
                k=numbers[i];
            }
        }
        System.out.println("The minimum number in the array is:"+k);
    
    }
}
