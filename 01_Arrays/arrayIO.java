import java.util.*;
public class arrayIO{
    public static void main(String args[]) {
    
        //Question 1
        //Array of names input from user and print them
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String names []= new String[a];
        for (int i=0;i<a;i++) {
            names[i]=sc.next();
            
        }
        System.out.println("the array contains:");
        for (int j=0;j<a;j++) {
           System.out.println(names[j]);
        }
    }
}
