import java.util.*;


class Palindrome
{
    public static int check(String s,int start,int end)
    {
        if(start>end)
        {
            return 1;
        }
        if(s.charAt(start)!=s.charAt(end))
        {
            return 0;
        }
        return check(s,start+=1,end-=1);
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int start=0,end=s.length()-1;
        System.out.println(check(s,start,end));
    }
}
