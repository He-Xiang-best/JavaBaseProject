package ex09;

public class P199_5 {

    public static int mb_caculate(int n) {
    	if(n==1||n==2)
    		return 1;
    	else if(n==3) 
    		return 2;
    	else if(n==4)
    		return 4;
    	else return(mb_caculate(n-1)+mb_caculate(n-2)+2);
    }
    public static int mb_fibonacci(int n) {
    	if(n<1)
    		return 0;
    	else if(n==1||n==2)
    		return 1;
    	else
    		return (mb_fibonacci(n-1)+mb_fibonacci(n-2));
    	
    }
	public static void main(String[] args) {
		System.out.println("Fibonacci(20) = "+mb_fibonacci(20)+" , 递归调用的次数为："+mb_caculate(20));

	}

}
