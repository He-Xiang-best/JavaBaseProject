package ch06;
public class _4TestFinally {
	public static void main(String[] args) {
	try{
		int n[]=new int[-5];
		for(int i=0;i<5;i++)
		{	n[i]=i;
			System.out.println(n[i]);
		}
	}
	catch(NegativeArraySizeException e1)
	{
		System.out.println(e1.toString()+"�����С����Ϊ����");
	}
	finally{
		System.out.println("ִ�����finally����");
		
		try{
			String str[]={"how are you?","I'm fine!"};
			for(int k=0;k<=2;k++)
				System.out.println("str["+k+"]:    "+str[k]);
		}
		catch(ArrayIndexOutOfBoundsException e3){
			System.out.println(e3.toString()+"�����±�Խ��");
		}
		finally{
			System.out.println("ִ���ڲ�finally����");
			System.out.println("I Love Java!");
		}
	}
	}

}
