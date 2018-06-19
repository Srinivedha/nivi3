import java.io.*;
import java.util.*;
class vowels
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        if(a>='a'&&a<='z')
        {
        if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
        System.out.print("vowels");
        else
        System.out.print("consonant");
        }
        else
        System.out.print("invalid");
    }
}
