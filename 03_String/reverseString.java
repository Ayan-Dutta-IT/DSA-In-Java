import java.util.*;
public class reverseString{
    public static void main(String args[]) {
    
        //Reverse a string
        StringBuilder name=new StringBuilder("Hello");
        StringBuilder reverseName= new StringBuilder("");
        for (int i=name.length()-1;i>=0;i--) {
            reverseName.append(name.charAt(i));
        }
        name=reverseName;
        System.out.println(name);
    }
}
