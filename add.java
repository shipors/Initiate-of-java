package add_sum;
public class add
{
    public static void main(String[] args)                      //用户使用命令行输入内容至args数组中；
        {
            System.out.println("输入数字:"+args.length);
            int sum=0;
            for (String arg:args)                               //for循环，args为数组，每循环一次将args中的内容赋给arg,直到args结束；
            {
                System.out.println(arg);
                sum+=Integer.parseInt(arg);                     //将arg中的数字处理为整型；
            }
            System.out.println("和为："+sum);                   //输出：和为（）括号中为sum的值；
        }
}
