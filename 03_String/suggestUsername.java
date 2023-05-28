import java.util.*;
public class suggestUsername.java{
    public static void main(String args[]) {
    
            //Question 3
            //Take email input from user and suggest username by taking everything before @
            Scanner sc=new Scanner(System.in);
            String email=sc.next();
            StringBuilder username=new StringBuilder("");
            for (int i=0;i<email.length();i++) {
                if(email.charAt(i)=='@') {
                    break;
                }
                else {
                    username.append(email.charAt(i));
                }
            }
            System.out.println(username);
    }
}
