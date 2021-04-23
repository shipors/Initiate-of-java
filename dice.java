public class dice
{
    static int[] number=new int[]{0,0,0,0,0,0};
    public static void main(String[] args)
    {
        dice num_throw=new dice(1000,6);
        dice output=new dice(6);
    }

    /*
    构造方法
    随机自然数发生器
    参数：times_throw，随机自然数生成次数
         range,产生的自然数最大为几
    日期：23/4/2021
    作者：shipors
     */
    public dice(int times_throw,int range)
    {
        for (int i=0;i<times_throw;i++)
        {
            //Math.random()[0,1),*6变成【0，6），+1变成【0，7）,b实际包含1-6
            int b=1+(int)(Math.random()*range);
            //让number数组的第 b-1 位加一
            switch (b)
            {
                case 1:number[b-1]++;break;
                case 2:number[b-1]++;break;
                case 3:number[b-1]++;break;
                case 4:number[b-1]++;break;
                case 5:number[b-1]++;break;
                case 6:number[b-1]++;break;
                default:System.out.println("ERR");break;
            }
        }
    }

    /*
      方法重载
      输出times_output种结果
      参数：times_output,输出语句的次数
      日期：4/22/2021
      作者：shipors
    */
    public  dice(int times_output)
    {
        //一键注释CTRL+/
        //依次输出number数组的值，即每个数字出现了多少次
        for (int a=0;a<times_output;a++)
        {
            System.out.println("1000次摇骰子中，结果为"+(a+1)+"的有" +number[a]+"次");
        }

        //do while语句实现循环，执行do，当while真，继续执行
//        int a=0;
//        do {
//            System.out.println("1000次摇骰子中，结果为一的有" +number[a++]);
//           }
//        while (a<times_output);
    }
}


