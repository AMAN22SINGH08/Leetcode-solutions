class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;int ind1=0;
        int ind2=0;int f=0;
        int num[] = new int[2];
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    ind1=i;
                    ind2=j;
                    f=1;
                    break;
                }
            if(f==1)
                break;
            }
        }
        num[0] = ind1;
        num[1] = ind2;
        return num;
    }
}