package ex2;
/**
 * <p>
 *ʵ��ڶ���
 *����K���Ľ׳�
 *
 *@author ������
 *@version 2.0
 *@since J2SE1.7
 *2017.2.28
 */
public class Factorial_my {
	/**
	 * ����k�Ľ׳ˣ�k����0����k�Ľ׳ˣ�С��0�����
	 * @param kΪ����
	 * @return k�Ľ׳�,ע��׳˵ļ������п��ܳ�����ʾ��Χ
	 * ���������ֵ���򷵻�-1,
	 * 12�Ľ׳���9λ��13�Ľ׳�����11λ���Ѿ���������ʾ��Χ
	 * ��kС��1���򷵻�0
	 */
	public int factorial(int k){
		int factorialN=1;
		if(k>1 && k<=12){
			for (int i=1;i<=k;i=i+1)
				factorialN=factorialN*i;			
		}//end for if k
		else if (k>12)//�жϽ��Խ��		
			factorialN=-1;		
		else factorialN=0;
		return factorialN;
	}
	
	/**
	 * ����k�ĳ�ֵ��
	 * Ҫ�ж�k��ֵ�Ƿ����0���ǵĻ����÷���Factorial_my�õ�k�Ľ׳�
	 * �������������ʾ
	 * @param args����������û�к���
	 */
	public static void main(String[] args) {
		int fN=1;//�������׳˵Ľ��
		int k=12;//���ü���k�Ľ׳�,���Ը�Ϊ�Ӽ�������һ������
		
		Factorial_my myfn=new Factorial_my();
		fN=myfn.factorial(k);//���÷�������K�Ľ׳�
		System.out.println(fN);
		//���ղ�ͬ������ڿ���̨������ 
		if (fN>0){//		
		   System.out.println(k+"�Ľ׳���:"+fN);
		}
		else if(fN==-1)
			System.out.println("�׳˵ļ����������������Χ");
		else System.out.println("k��ֵ����С��0");

	}

}
