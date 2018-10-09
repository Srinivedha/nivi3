import java.io.*;
import java.util.*;
class str1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int len=a.length();
        int count=0;
        String b="1234567890.";
        for(int i=0;i<len;i++)
        {
            if(b.contains(a.charAt(i)+""))
            {
                count++;
            }
        }
        if(count==len)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
