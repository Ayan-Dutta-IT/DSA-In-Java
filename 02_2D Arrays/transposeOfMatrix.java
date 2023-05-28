import java.util.*;
public class transposeOfMatrix{
    public static void main(String args[]) {
    
        //Question 2
        //Print transpose of a given matrix of NxM
        Scanner sc= new Scanner (System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int numbers [][]=new int [r][c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                numbers [i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<c;i++) {
            for (int j=0;j<r;j++) {
                System.out.print(numbers[j][i]+" ");
            }
            System.out.println();
        } 
    
    }
}
