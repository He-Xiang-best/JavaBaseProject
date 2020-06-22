package ex2;
/**
* 第二章第6题
* 打印三角形
* 采用方法来封装打印方法，同时三角形长度可变。
*@author 郭晓燕
*@version 2.0
*@since J2SE1.7
*2017.3.1
*/
public class Pascal_Triangle_Two {
	//static int length=11;
	public static void printPasclTrian(int length){
		for (int i=1;i<=length;i++){
			  if (i<=length/2+1){
				for (int m=0;m<length/2+1-i;m++)
					System.out.print(" ");
				for (int n=0;n<2*i-1;n++)
					System.out.print("*");
				System.out.println();
			  }//end for if(i<=length/2+1)
			  else{
				  int k=i-(length/2+1);
				  for (int m=0;m<k;m++)
					  System.out.print(" ");
				  for (int n=0;n<length-2*k;n++)
					  System.out.print("*");
				  System.out.println();
			  }//end for else
			}
			
	}
	/**
	 * 调用一个静态方法，从键盘中输入一个数字
	 * 判断数字是否为奇数
	 * 奇数则调用方法打印杨辉三角
	 * 偶数则提示出错
	 * @param args参数没有含义
	 */
	public static void main(String[] args) {
		//int leng=7;
		int leng=InputPara.inputIntNumber();
		if (leng%2==1)//leng必须为奇数
		  Pascal_Triangle_Two.printPasclTrian(leng);
		else System.out.println("leng必须为奇数");		
	}

}
