import java.util.Scanner;
class FindDigits
{
    public static void FindDigits(int n)
    {
        int sum=0,prod=1,r;
        while (n>0)
        {
            r=n%10;
            sum=sum+r;
            prod=prod*r;
            n=n/10;
        }
        if(sum==prod)
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        FindDigits(n);
    }
}