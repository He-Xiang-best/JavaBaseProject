package ex2;
/**
 * 第二章第10题
 * 计算50-100之间所有的素数
 * 
 * @author 郭晓燕
 * @since j2SE1.6
 * 2017.3.1
 */
public class Two_Ten {
	/**
	 * 判断数字n是否是素数
	 * 是素数返回真值
	 * 否则为假
	 * @param n 参数输入整数n
	 * @return 布尔值判断是否是素数
	 */
	public static boolean primeNum(int n){
		boolean flag=true;
		for (int i=2;i<n;i++){
			if (n%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	/**
	 * 
	 * @param n1 一个大于0的整数，小于等于n2
	 * @param n2 一个大于0的整数
	 */
	public void primeNumber(int n1,int n2){
		if (n1<=n2){
			for (int k=n1;k<=n2;k++)
				if (Two_Ten.primeNum(k))
					System.out.print(k+" ");
		}else System.out.print("n2应该大于n1");
	}
	/**
	 * 调用primNumber
	 * 判断50-100间素数
	 * @param args没有什么含义
	 */
	public static void main(String[] args) {
		Two_Ten tt=new Two_Ten();
		tt.primeNumber(50, 100);		
	}

}
