package ex2;
/**
* ʵ��ڶ���
* ѧϰ��Java����ε��÷�����С����
* ����n���ڵ�ż��
*@author ������
*@version 2.0
*@since J2SE1.7
*2017.2.29
*/
public class EvenNumber {
	/***
	 * ���n���ڵ�����ż��
	 * ����n����0С��0�����
	 * ÿ���10�����ֻ���
	 * @param n ����Ϊ����
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
				//ÿ���ʮ�����ֽ��л���
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
		int k=200;//���Խ���ĳɴӼ��������������
		EvenNumber even=new EvenNumber();
	    even.computerOdd(k);		
	}
}
