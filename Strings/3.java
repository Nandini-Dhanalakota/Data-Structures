//Leetcode 771 - jewels and stones
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0; i < stones.length(); i++)
        {
            for(int j = 0; j < jewels.length(); j++)
            {
                if(jewels.charAt(j)==stones.charAt(i))
                {
                    count++;
                }
            }
        }
        //System.out.println(count);
        return count;
    }
}
