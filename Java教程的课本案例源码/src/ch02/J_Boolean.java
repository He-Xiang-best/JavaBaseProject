package ch02;

public class J_Boolean
{
    public static void main(String args[ ])
    {
        int month=8; // 定义变量month，并赋初值8
        int day=1; // 定义变量day，并赋初值1
        if ((month==8) || (++day<15))
            System.out.println("Month=" + month + ", Day=" + day);
        if ((month==8) | (++day<15))
            System.out.println("Month=" + month + ", Day=" + day);
        System.out.print( "第1题：");
        int a=12;
    System.out.println((++a)+(a++)+"::::"+a);
    
    } // 方法main结束
} // 类J_Boolean结束

