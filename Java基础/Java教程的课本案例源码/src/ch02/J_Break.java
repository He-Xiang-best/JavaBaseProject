package ch02;

public class J_Break
{
    public static void main(String args[ ])
    {
        int i = 0; // 定义变量i，并赋初值0
        aBreakBlock:
        {
            System.out.println("在break语句之前");
            if (i<=0)
                 break aBreakBlock; // 用来跳出aBreakBlock语句块
            System.out.println("在if和break语句之后");
        } // 语句块aBreakBlock结事
        System.out.println("在aBreakBlock语句块之后");
    } // 方法main结束
} // 类J_Break结束
