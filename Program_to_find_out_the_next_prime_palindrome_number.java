import java.util.Scanner;
class Sample
{
    public static boolean isPrime(int m)
    {
        int count=0;
        for (int i=2;i<=(int)Math.sqrt(m);i++)
        {
            if(m%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
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
        int n;
        n=sc.nextInt();
        for(int i=n+1; ;i++)
        {
            if(isPrime(i) && isPalindrome(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}