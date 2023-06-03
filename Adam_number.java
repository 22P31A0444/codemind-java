import java.util.*;
public class Mounika
{
    public static void main(String args[])
    {
        int n,s=0,a,i,pro,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=n*n;
        for(i=n;i>0;i=i/10)
        {
            b=i%10;
            s=s*10+b;
        }
        pro=s*s;
        s=0;
        for(i=pro;i>0;i=i/10)
        {
            b=i%10;
            s=s*10+b;
        }
        if(s==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}