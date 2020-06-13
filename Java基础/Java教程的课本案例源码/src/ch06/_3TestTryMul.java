package ch06;

public class _3TestTryMul {
	public static void main(String[] args) 
			throws ArithmeticException,
			NegativeArraySizeException,
			ArrayIndexOutOfBoundsException
	{
		//try{
			int m=1;
			int num=100/m;         //	
		/*}catch(ArithmeticException e2){
			System.out.println(e2.toString()+"除数不能为0");
		}
		
		try{*/	
			int n[]=new int[-10];     //
			for(int i=0;i<10;i++)    //
				n[i]=i;             //
		/*}
		catch(NegativeArraySizeException e1){
				System.out.println(e1.toString()+"数组大小不能为负数");
			}
		try{*/
			String str[]={"how are you?","I'm fine!"};
			for(int k=0;k<=2;k++)
				System.out.println("str["+k+"]:    "+str[k]);
		
		/*}		
		catch(ArrayIndexOutOfBoundsException e3){
			System.out.println(e3.toString()+"数组下标越界");
		}
		*/
		
		System.out.println("捕获语句后执行的语句");	
	}

}


