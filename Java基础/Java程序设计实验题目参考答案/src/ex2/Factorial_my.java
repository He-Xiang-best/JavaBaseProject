package ex2;
/**
 * <p>
 *实验第二章
 *计算K！的阶乘
 *
 *@author 郭晓燕
 *@version 2.0
 *@since J2SE1.7
 *2017.2.28
 */
public class Factorial_my {
	/**
	 * 计算k的阶乘，k大于0计算k的阶乘，小于0则忽略
	 * @param k为整数
	 * @return k的阶乘,注意阶乘的计算结果有可能超出表示范围
	 * 若超出最大值，则返回-1,
	 * 12的阶乘是9位，13的阶乘则是11位，已经超出最大表示范围
	 * 若k小于1，则返回0
	 */
	public int factorial(int k){
		int factorialN=1;
		if(k>1 && k<=12){
			for (int i=1;i<=k;i=i+1)
				factorialN=factorialN*i;			
		}//end for if k
		else if (k>12)//判断结果越界		
			factorialN=-1;		
		else factorialN=0;
		return factorialN;
	}
	
	/**
	 * 设置k的初值，
	 * 要判断k的值是否大于0，是的话调用方法Factorial_my得到k的阶乘
	 * 否则输出错误提示
	 * @param args参数在这里没有含义
	 */
	public static void main(String[] args) {
		int fN=1;//保存计算阶乘的结果
		int k=12;//设置计算k的阶乘,可以改为从键盘输入一个数字
		
		Factorial_my myfn=new Factorial_my();
		fN=myfn.factorial(k);//调用方法计算K的阶乘
		System.out.println(fN);
		//按照不同的情况在控制台输出结果 
		if (fN>0){//		
		   System.out.println(k+"的阶乘是:"+fN);
		}
		else if(fN==-1)
			System.out.println("阶乘的计算结果超出整数最大范围");
		else System.out.println("k的值不能小于0");

	}

}
