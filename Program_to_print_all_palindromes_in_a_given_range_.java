import java.util.Scanner;
class Sample
{
   
    public static boolean isPalindrome(int m)
    {
        int temp=m;
        int sum=0,r;
        while (m>0)
        {
            r=m%10;
            sum=sum*10+r;
            m=m/10;
        }
        if(temp==sum)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if (isPalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}