package ex09;
/**
 * @content:�õݹ�ͷǵݹ�ķ����ֱ����10!
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��4������3:18:45
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��4������3:18:45
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class P199_7 {
    static long startTime;
    static long endTime;
	public static void main(String[] args) {
		//�ǵݹ鷽������10��
		long num = 1;
		startTime = System.nanoTime();
		for(int i = 1;i<=10;i++) {
			num*=i;
		}endTime = System.nanoTime();
         System.out.println("�ǵݹ鷽������10�� = "+num+"������ʱ�� "+(endTime-startTime));
         startTime = System.nanoTime();
         System.out.print("�ݹ鷽������10�� = "+DiGuiMethod(10));
         endTime = System.nanoTime();
         System.out.println("������ʱ�� "+(endTime-startTime));
	}
	//�ݹ����10��
	public static long DiGuiMethod(long n) {
		if(n<=0||n==1)
			return  1;
		else 
		return  n*DiGuiMethod(n-1);		
	}	
}
