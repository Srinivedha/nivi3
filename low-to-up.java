import java.io.*;
import java.util.*;
class low-to-up
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
       String a=s.nextLine();
       String arr[]=a.split("\\s");
       int len=arr.length;
       for(int i=0;i<len;i++)
       {
           int len1=arr[i].length();
           String a1=arr[i].charAt(0)+"";
           String a2=arr[i].substring(1,arr[i].length());
           System.out.print(a1.toUpperCase()+a2.toLowerCase());
           if(i!=len-1)
           {
               System.out.print(" ");
           }
       }
       
    }
}
