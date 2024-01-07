//Leetcode - 1221
//Split a String in Balanced Strings

class Solution {
    public int balancedStringSplit(String s) {

    int Lcounter = 0;
    int Rcounter = 0;
    int count = 0;

    for(int i = 0 ; i < s.length() ; i++){
        if(s.charAt(i) == 'R'){
            Rcounter++;
        }else{
            Lcounter++;
        }

        if(Lcounter ==  Rcounter){
            count++;
        }
    }
    return count;
    }
}
