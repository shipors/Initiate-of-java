import java.util.Scanner;                        //使用Scanner时idea自动生成

public class month
{
    public static void main(String[] args)
    {
        do {                                     //使用do while语句实现反复查询而不是一次查询就退出
            Scanner input=new Scanner(System.in);//Scanner类用于获取控制台输入，新建一Scanner类对象input，将用户在控制台输入的内容赋给input；
            int month;
            month=input.nextInt();               //将input对象中下一个整型赋给month
            switch (month)
            {
                case 1 :System.out.println("January");  break;
                case 2 :System.out.println("February"); break;
                case 3 :System.out.println("March");    break;
                case 4 :System.out.println("April");    break;
                case 5 :System.out.println("May");      break;
                case 6 :System.out.println("June");     break;
                case 7 :System.out.println("July");     break;
                case 8 :System.out.println("August");   break;
                case 9 :System.out.println("September");break;
                case 10:System.out.println("October");  break;
                case 11:System.out.println("November"); break;
                case 12:System.out.println("December"); break;
                default: System.out.println("err");
            }
        }
        while (true);

    }

}
