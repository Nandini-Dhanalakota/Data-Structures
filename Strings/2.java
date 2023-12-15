/* Given a string , print "Yes" if it is a palindrome, print "No" otherwise.

  Sample Input
   madam

  Sample Output
   Yes
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        boolean mystr = false;
        int k = A.length() - 1;
        for(int i = 0; i < A.length()/2; i++)
        {
            if(A.charAt(i) != A.charAt(k-i))
            {
                mystr = true;
                break;
            }
        }
        if(mystr)
        {
            System.out.println("No");
        }
        else
        {
           System.out.println("Yes"); 
        }
    }
}
