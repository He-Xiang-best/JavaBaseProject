package ex6_;
/**
 * �����µ�����
 * �����������ͳ�����Ĵ���  
 * @author ������
 * @since JDK1.6
 * @version 1.1
 * 
 */
public class Four_5_MathRandom {
	
	int[] countArray;
	public Four_5_MathRandom(int length){
		countArray=new int[length];
		for (int i=0;i<length;i++){
			countArray[i]=0;
		}
	}
    /**
     * �������number�η�Χ��1��range֮���������ͳ�Ƹ���
     * @param number �������
     * @param range ��Χ
     */
	public void randomAndCount(int number,int range){
		for (int i=1;i<number;i++){
			int random=(int)(Math.random()*range+0.5);
			countArray[random]++;
		}
	}
	/**
	 * ��ӡcountArray��������
	 */
	public void printInfo(){
		 for (int i=0;i<countArray.length;i++){
			System.out.println("����"+i+"���ֵĴ���"+countArray[i]);
		 }
	}
}
