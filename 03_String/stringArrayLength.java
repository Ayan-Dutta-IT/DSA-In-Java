import java.util.*;
public class stringArrayLength{
    public static void main(String args[]) {
    
    //Question 1
        //String array as input then find total length of all those string
        Scanner sc= new Scanner(System.in);
        System.out.println("Input total number of strings to be entered in the array:");
        int n=sc.nextInt();
        String names []=new String[n];
        int ccount=0;
        for (int i=0;i<n;i++) {
            names[i]=sc.next();
        }
        for (int j=0;j<n;j++) {
            ccount=ccount+names[j].length();
        }
        System.out.println("Total length of the string array:"+ccount);
    }
}
