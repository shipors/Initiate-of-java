import java.util.Scanner;
public class recursion
{
    static int  a=1;
    public static void main(String[] args)
    {
        recursion recurse=new recursion();
        System.out.println("结果为:"+recursion());
    }

    public static int recursion()
    {
        Scanner input_n=new Scanner(System.in);
        Scanner input_k=new Scanner(System.in);
        int number_n=input_n.nextInt();
        int number_k=input_k.nextInt();
        return recursion(number_n)/recursion(number_k)/recursion((number_n-number_k));
    }
    public static int recursion(int num)
    {
        if (num==1|num==0)
        {
            return 1;
        }
        else
            return num * recursion(num - 1);
    }
}
