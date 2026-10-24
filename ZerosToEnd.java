class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int temp[] = new int[l];
        int j=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i] != 0 )
            {
                temp[j++] = nums[i];
            }
        }
        while(j<l)
        {
            temp[j++] = 0;
        }
        for(int k=0;k<l;k++)
        {
            nums[k] = temp[k];
        }
        return;
    }
}