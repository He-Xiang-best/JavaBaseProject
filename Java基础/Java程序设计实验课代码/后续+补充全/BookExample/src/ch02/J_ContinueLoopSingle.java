package ch02;

public class J_ContinueLoopSingle
{
    public static void main(String args[ ])
    {
        for (int i=0; i< 10; i++)
        {
            if (1<i && i<8)
                continue;
            	//break;
            System.out.println("i=" + i);
        } // for循环结束
        int sum=0;
        for (int i=0; i<= 100; i++)
                sum+=i;
        System.out.println("sum=" + sum);
    } // 方法main结束
} // 类J_ContinueLopSingle结束
