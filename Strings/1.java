/* 
Sample Input 
hello
java

Sample Output 
9 (addition of lengths of strings)
No (lexicographical comparision)
Hello Java (comversion of first letters of strings into capitals)
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.length() + b.length());
        if(a.compareTo(b) > 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1));
    }
}
