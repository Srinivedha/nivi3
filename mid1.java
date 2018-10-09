import java.io.*;
import java.util.*;
class mid1
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
        if(a%2==0)
        {
         int k=(a/2)-1;
         System.out.print(arr[k]);
        }
        else
        {
            int k=(a/2);
            System.out.print(arr[k]);
        }
    }
}
