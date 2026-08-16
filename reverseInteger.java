import java.util.*;
class Solution {
    public int reverse(int x) {
        int d=0;
        long r=0;
        while(x!=0)
        {
            d=x%10;
            r=10*r+d;
            x=x/10;
        }
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int)r;
    }
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n==0 && n!=0)
        {
            System.out.println("0");
        }
        else
        {
            reverse(n);
        }
    }
}