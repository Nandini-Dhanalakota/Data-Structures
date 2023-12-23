//hackerrank string tokens
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
         scan.close();
        s = s.replace("!", " ");
        s = s.replace(",", " ");
        s = s.replace("?", " ");
        s = s.replace(".", " ");
        s = s.replace("_", " ");
        s = s.replace("'", " ");
        s = s.replace("@", " ");
        s = s.trim().replaceAll(" +", " ");
        if(s.isEmpty()){
            System.out.println(0);
            return;
    }
        String[] li = s.split(" ");
        System.out.println(li.length);
        for(String str: li){
            System.out.println(str);
    }
        
        scan.close();
    }
}

//(or)

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        if(s.length()==0){
            System.out.println(0);
        }
        else{
        String[] arr = s.split("[.\\?@_\\s'!,]+");    
        System.out.println(arr.length);
        for(String ar : arr){
            System.out.println(ar);
        }
        }
        scan.close();
    }
}
