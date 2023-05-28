import java.util.*;
public class linearSearch{
    public static void main(String args[]) {
    
      //Question 1
        //Linear Search
        //Take an user input array and search for given number x and print its index
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int marks []= new int[n];
        for (int i=0;i<n;i++) {
            int j=sc.nextInt();
            marks[i]=j;
        }
        System.out.print("Number to search for:");
        int l=sc.nextInt();
        for (int k=0;k<n;k++) {
            if (marks[k]==l) {
                System.out.println(k);
            }
        }
    
    }
}
