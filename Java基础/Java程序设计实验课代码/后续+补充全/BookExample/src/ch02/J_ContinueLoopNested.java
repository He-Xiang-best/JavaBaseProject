package ch02;

public class J_ContinueLoopNested
{
    public static void main(String args[ ])
    {
       //aContinueBlock:
        for (int i=0; i< 4; i++)
        {
            for (int j=0; j< 2; j++)
            {
                if (0<i && i<3)
                     continue ;
                		//break;
                	System.out.println("i=" + i + ", j=" +j);
            } // 内层for循环结束
        } // 语句块aContinueBlock结束, 外层for循环结束
    } // 方法main结束
} // 类J_ContinueLoopNested结束
