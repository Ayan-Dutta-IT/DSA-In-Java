import java.util.*;
public class ascCheck{
    public static void main(String args[]) {
    
    
            //Question 3
            //To take array of number as input and check if it is in ascending order
            Scanner sc = new Scanner (System.in);
            int a=sc.nextInt();
            int numbers []= new int[a];
            int asc=0;
            int dsc=0;
            for (int b=0;b<a;b++) {
                numbers[b]=sc.nextInt();
            }
            for (int i=0;i<a-1;i++) {
               if (numbers[i]<numbers[i+1]) {
                    asc++;
                }
                else {
                    dsc++;
                }
            }
            if (asc==a-1 && dsc==0) {
                System.out.println("It is in ascending order");
            }
            else {
                System.out.println("It is not in ascending order");
            } 
    
    }
}
