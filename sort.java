import java.io.*;
import java.util.*;
class sort
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
        Arrays.sort(arr);
        for(int i=0;i<a;i++)
        {
            if(i!=a-1)
            System.out.print(arr[i]+" ");
            else
            System.out.print(arr[i]);
        }
    }
}
