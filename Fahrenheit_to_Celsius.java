import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
       float f;
       float c;
       Scanner sc=new Scanner(System.in);
       f=sc.nextFloat();
       c=(f-32)*5/9;
       System.out.format("%.2f",c);
       
    }
}