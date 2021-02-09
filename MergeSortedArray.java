// https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nCount = n-1;
        int mCount = m-1;
        int nm = n+m -1;
        
        while (nCount > -1) 
        {
            if( mCount >= 0 && nums1[mCount] > nums2[nCount])
            {
                nums1[nm] = nums1[mCount];
                mCount--;
            }
            else
            {
                nums1[nm] = nums2[nCount];
                nCount--;
            }
            nm--;
        }
    }
}
