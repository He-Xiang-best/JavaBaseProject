package ex2;
/**
 * �ڶ��µ�10��
 * ����50-100֮�����е�����
 * 
 * @author ������
 * @since j2SE1.6
 * 2017.3.1
 */
public class Two_Ten {
	/**
	 * �ж�����n�Ƿ�������
	 * ������������ֵ
	 * ����Ϊ��
	 * @param n ������������n
	 * @return ����ֵ�ж��Ƿ�������
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
	 * @param n1 һ������0��������С�ڵ���n2
	 * @param n2 һ������0������
	 */
	public void primeNumber(int n1,int n2){
		if (n1<=n2){
			for (int k=n1;k<=n2;k++)
				if (Two_Ten.primeNum(k))
					System.out.print(k+" ");
		}else System.out.print("n2Ӧ�ô���n1");
	}
	/**
	 * ����primNumber
	 * �ж�50-100������
	 * @param argsû��ʲô����
	 */
	public static void main(String[] args) {
		Two_Ten tt=new Two_Ten();
		tt.primeNumber(50, 100);		
	}

}
