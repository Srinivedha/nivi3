import java.io.*;
import java.util.*;
class remove
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    String a1=s.nextLine();
    String b="aeiouAEIOU";String ans="";
    for(int i=0;i<a1.length();i++)
    {
        String e=a1.charAt(i)+"";
        if(b.contains(e))
        {
        }
        else
        {
            ans=ans+e;
        }
    }
    System.out.print(ans);
    
    }
    
}
