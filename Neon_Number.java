import java.util.Scanner;
class Neon
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,sq=1,sum=0,r;
        n=sc.nextInt();
        sq = n * n;
        while (sq > 0)
        {
            r = sq % 10;
            sum = sum + r;
            sq= sq / 10;
        }
        if (n == sum)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}