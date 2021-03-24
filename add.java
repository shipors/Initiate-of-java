package add_sum;
public class add
{
    public static void main(String[] args)
        {
            System.out.println("输入数字:"+args.length);
            int sum=0;
            for (String arg:args)
            {
                System.out.println(arg);
                sum+=Integer.parseInt(arg);
            }
            System.out.println("和为："+sum);
        }
}
