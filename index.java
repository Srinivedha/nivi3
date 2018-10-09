import java.io.*;
import java.util.*;
class index
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(arr[i]+" "+i);
        }
    }
}
