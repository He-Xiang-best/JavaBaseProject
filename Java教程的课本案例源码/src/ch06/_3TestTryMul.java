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
			System.out.println(e2.toString()+"��������Ϊ0");
		}
		
		try{*/	
			int n[]=new int[-10];     //
			for(int i=0;i<10;i++)    //
				n[i]=i;             //
		/*}
		catch(NegativeArraySizeException e1){
				System.out.println(e1.toString()+"�����С����Ϊ����");
			}
		try{*/
			String str[]={"how are you?","I'm fine!"};
			for(int k=0;k<=2;k++)
				System.out.println("str["+k+"]:    "+str[k]);
		
		/*}		
		catch(ArrayIndexOutOfBoundsException e3){
			System.out.println(e3.toString()+"�����±�Խ��");
		}
		*/
		
		System.out.println("��������ִ�е����");	
	}

}


