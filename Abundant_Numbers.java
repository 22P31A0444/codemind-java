import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int n,q,i,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        q=n;
        for(i=1;i<n;i++)
        {
            if(q%i==0)
            {
                s=s+i;
            }
        }
        if(s>n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}