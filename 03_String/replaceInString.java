import java.util.*;
public class replaceInString{
    public static void main(String args[]) {
    
            //Question 2
            //Take string input from user and replace letter e with i and store in another string and display it
            Scanner sc=new Scanner(System.in);
            String original="An apple a day keeps the doctor away";
            StringBuilder result= new StringBuilder("");
            for (int i=0;i<original.length();i++) {
                if (original.charAt(i)=='e' || original.charAt(i)=='E') {
                    result.append('i');
                }
                else {
                    result.append(original.charAt(i));
                }
            } 
            System.out.println(result); 
    }
}
