import java.io.*;
import java.util.*;
class hour
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=a/60;
       int c=b*60;
       int d=a-c;
       System.out.print(b+" "+d);
    }
}
