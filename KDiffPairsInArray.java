//https://leetcode.com/problems/k-diff-pairs-in-an-array/
//medium 

import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int pairsCount = 0;
        int lastIndex = -1;
        
        for (int i = 0; i < nums.length-1; i++)
        {
            int j = i +1;
            if (nums[i] == nums[j])
            {
                
                if( k==0 && lastIndex == -1)
                {
                    lastIndex = j;
                    pairsCount++;
                }
            }
            else
            {
                lastIndex = -1;
                while (nums[j] < (nums[i] + k) && (j < nums.length-1))
                {
                    j++;
                }
                if ((nums[i]  + k) == nums[j])
                    pairsCount++;
            }
        }
        
        return pairsCount;
 }
