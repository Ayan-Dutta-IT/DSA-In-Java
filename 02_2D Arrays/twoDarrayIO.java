import java.util.*;
public class twoDarrayIO{
    public static void main(String args[]) {
      //question 1
      //To take input and print output for a 2D Array
        
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int numbers [][]= new int [r] [c]; 
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                numbers [i] [j]= sc.nextInt();
            }
        }
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.print(numbers [i] [j]+" ");
           }
            System.out.println();
        }
    }
}
