import java.io.*;
import java.util.*;
class guvipr
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a="saturday";
        String a1="sunday";
        String b=s.nextLine();
        if((b.toLowerCase().equals(a))||(b.toLowerCase().equals(a1)))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
