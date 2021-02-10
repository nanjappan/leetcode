// https://leetcode.com/problems/reverse-words-in-a-string/
// medium

import java.lang.StringBuilder;

class Solution {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        
        StringBuilder builder = new StringBuilder();
        for (int i = sArr.length - 1; i>=0;i--)
        {
            if (!"".equals(sArr[i]))
            {    
                if (i < (sArr.length - 1) )
                    builder.append(" ");
                builder.append(sArr[i]);
            }
        }
        
        return builder.toString();
    }
}
