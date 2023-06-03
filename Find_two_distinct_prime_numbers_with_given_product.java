import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int a,b,c=0,i,j,p=0,k,l,s;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                for(k=1;k<=a;k++)
                {
                    s=0;
                    for(l=1;l<=k;l++)
                    {
                        if(k%l==0)
                        {
                            s++;
                        }
                    }
                    if(s==2)
                    {
                        if(i*k==a)
                        {
                            System.out.format("%d %d",i,k);
                            p=1;
                            break;
                        }
                    }
                }
            }
            if(p==1)
            break;
        }
        if(p==0)
        {
            System.out.println("-1");
        }
    }
}