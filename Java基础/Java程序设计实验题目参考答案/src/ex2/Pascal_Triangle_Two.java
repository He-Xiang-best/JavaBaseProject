package ex2;
/**
* �ڶ��µ�6��
* ��ӡ������
* ���÷�������װ��ӡ������ͬʱ�����γ��ȿɱ䡣
*@author ������
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
	 * ����һ����̬�������Ӽ���������һ������
	 * �ж������Ƿ�Ϊ����
	 * ��������÷�����ӡ�������
	 * ż������ʾ����
	 * @param args����û�к���
	 */
	public static void main(String[] args) {
		//int leng=7;
		int leng=InputPara.inputIntNumber();
		if (leng%2==1)//leng����Ϊ����
		  Pascal_Triangle_Two.printPasclTrian(leng);
		else System.out.println("leng����Ϊ����");		
	}

}
