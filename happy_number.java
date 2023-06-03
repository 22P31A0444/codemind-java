import java.util.*;
public class Mounika
{
    public static void main(String args[])
    {
        int n,b,i,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        i=n;
        while(i>9)
        {
            sum=0;
            for(i=i;i>0;i=i/10)
            {
                b=i%10;
                sum+=b*b;
            }
            if(sum>9)
            {
                i=sum;
            }
        }
        if(sum==1 ||sum==7)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    
}