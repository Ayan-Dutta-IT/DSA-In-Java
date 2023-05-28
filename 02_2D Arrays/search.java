import java.util.*;
public class search{
    public static void main(String args[]) {
    
    //Question 1
        //Take a 2D Array input from user and then search for 
        //a given number x and print its indices


        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int numbers [] []=new int [r] [c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                numbers [i] [j]=sc.nextInt();
            }
        }
        int a=sc.nextInt();
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                if ( numbers [i] [j]==a) {
                int l=i+1;
                int k=j+1;
                System.out.println(l+","+k);
               }
           }
        } 
    }
}
