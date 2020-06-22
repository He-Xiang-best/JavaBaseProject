package ex6_;
/**
 * 第四章第五题
 * 生成随机数并统计数的次数  
 * @author 郭晓燕
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
     * 随机生成number次范围从1到range之间的数，并统计个数
     * @param number 随机次数
     * @param range 范围
     */
	public void randomAndCount(int number,int range){
		for (int i=1;i<number;i++){
			int random=(int)(Math.random()*range+0.5);
			countArray[random]++;
		}
	}
	/**
	 * 打印countArray数组内容
	 */
	public void printInfo(){
		 for (int i=0;i<countArray.length;i++){
			System.out.println("数字"+i+"出现的次数"+countArray[i]);
		 }
	}
}
