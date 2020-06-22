package ex2;
/**
* 实验第二章
* 学习在Java中如何调用方法的小例子
* 计算n以内的偶数
*@author 郭晓燕
*@version 2.0
*@since J2SE1.7
*2017.2.29
*/
public class EvenNumber {
	/***
	 * 输出n以内的所有偶数
	 * 区分n大于0小于0的情况
	 * 每输出10个数字换行
	 * @param n 参数为整数
	 * 
	 */
	public void computerOdd(int n){
		int k=0;
		if (n>=0){
			for(int i=0;i<=n;i++){
				if ((i%2)==0){
					System.out.print(i+",");
					k++;
				}
				//每输出十个数字进行换行
				if (k==10){
					System.out.println();//
					k=0;
			}//end for if
			}
		}//end for if(n>=0)
		else{
			for(int i=n;i<=0;i++){
				if ((i%2)==0){
					System.out.print(i+",");
					k++;
				}
		}//end for for
		}//end for else
		
	}
	
	public static void main(String[] args) {
		int k=200;//可以将其改成从键盘中输入的数字
		EvenNumber even=new EvenNumber();
	    even.computerOdd(k);		
	}
}
