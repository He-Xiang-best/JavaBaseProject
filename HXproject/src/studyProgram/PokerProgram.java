package studyProgram;
/**
 * 
 * @content:用数组实现模拟扑克牌的洗牌程序
 * @author:何翔
 * @time:2020年2月21日下午4:18:28
 */
public class PokerProgram {
	/*
	 * 数组下标：[0]...[12]    [13]...[25]    [26]...[38]    [39]...[51]
	 
	 * 数组元素：   0...12        13...25        26...38        39...51
	               ↓              ↓              ↓              ↓
	 *数组元素可      黑桃                     红桃                       方块                       梅花
	    以分成4组         ♠             ♥              ♦               ♣
	 
	 *每组13个元素；/13可以得到花色；%13可以取得牌面数值；
	 */
     public static void main(String[] args) {
		final int N = 52;
		//52张牌
		int[] cards = new int[N];
		String[] cardcolors = {"♠","♥","♦","♣"};
		String[] cardvalues = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.println("洗牌前牌的顺序为：");
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;//牌面与循环变量的值一致，0——51之间；
			if(i%13==0)
				System.out.println();
			System.out.printf("%s-%s\t",cardcolors[cards[i] / 13],cardvalues[cards[i] % 13]);
			//System.out.print(cards[i] + "\t");
		}
		//洗牌原理：随机生成一个0——51之间的数字newIndex，cards[i]和cards[newIndex]之间的元素相互交换
		System.out.println("\n");
		for (int i = 0; i < cards.length; i++) {
			int newIndex = (int)(Math.random() * N);//0---51之间的牌
			int temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp;
		}
		System.out.println("洗牌后牌的顺序为：");
			for (int i = 0; i < cards.length; i++) {
				if(i%13==0)
					System.out.println();
				System.out.printf("%s-%s\t",cardcolors[cards[i] / 13],cardvalues[cards[i] % 13]);
				//System.out.print(cards[i] + "\t");
			}		
		
	}
}
