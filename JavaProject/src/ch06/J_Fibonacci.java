package ch06;

// ////////////////////////////////////////////////////////
// 
// J_Fibonacci.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ���õݹ����Fibonacci(30)�����̡�
// ////////////////////////////////////////////////////////


public class J_Fibonacci
{
    public static int mb_fibonacci(int n)
    {
        if (n< 1)
            return(0);
        else if (n==1 || n==2)
            return(1);
        return(mb_fibonacci(n-1)+mb_fibonacci(n-2));
    } // ����mb_fibonacci����

    public static void main(String args[ ])
    {
        int n = 30;
        System.out.println("Fibonacci(" + n + ")=" + mb_fibonacci(n));
    } // ����main����
} // ��J_Fibonacci����
