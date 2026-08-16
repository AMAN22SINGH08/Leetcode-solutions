import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int d;
        int r=0;
        int o = x;
        while(x!=0)
        {
            d = x%10;
            r = 10*r+d;
            x = x/10;
        }
        return o==r;
    }
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(isPalindrome(n))
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}