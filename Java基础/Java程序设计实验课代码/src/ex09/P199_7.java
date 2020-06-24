package ex09;
/**
 * @content:用递归和非递归的方法分别结算10!
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月4日下午3:18:45
 * @第一次修改的时间：
 * @time:2020年6月4日下午3:18:45
 * @修改原因：课堂测验，修改内容：
 */
public class P199_7 {
    static long startTime;
    static long endTime;
	public static void main(String[] args) {
		//非递归方法计算10！
		long num = 1;
		startTime = System.nanoTime();
		for(int i = 1;i<=10;i++) {
			num*=i;
		}endTime = System.nanoTime();
         System.out.println("非递归方法计算10！ = "+num+"——用时： "+(endTime-startTime));
         startTime = System.nanoTime();
         System.out.print("递归方法计算10！ = "+DiGuiMethod(10));
         endTime = System.nanoTime();
         System.out.println("——用时： "+(endTime-startTime));
	}
	//递归计算10！
	public static long DiGuiMethod(long n) {
		if(n<=0||n==1)
			return  1;
		else 
		return  n*DiGuiMethod(n-1);		
	}	
}
