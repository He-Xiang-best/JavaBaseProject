package studyProgram;

import java.util.Scanner;

/**
 * @contend：猜价格抽奖活动 
 * @author： 何翔 
 * @time： 2020年2月18日下午10:21:14
 */
public class LotteryAcctive {
	private static Scanner input;

	public static void main(String[] args) {
		//设置随机抽奖数范围在1000~9000的千整数型；
		final int rightPrice = (((int)(Math.random() * 1000)) % 9 + 1) * 1000;
		//System.out.println(rightPrice);
		//final int rightPrice = 5000;
		int guessPrice = -1;
		System.out.println("欢迎来到猜价抽奖活动现场，本次活动您共有5次猜价机会哦！");
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入您猜的价格吧：");
			input = new Scanner(System.in);
			guessPrice = input.nextInt();
			if (guessPrice == rightPrice && i == 1) {
				System.out.println("恭喜您，第1次就猜对了!\n获得了iPhone8s plus plus 土豪金精美礼品一份!");
				break;
			} else if (guessPrice == rightPrice && (i == 2 || i == 3)) {
				System.out.println("恭喜您，第" + i + "次就猜对了!\n获得了华为荣耀手环精美礼品一份!");
				break;
			} else if (guessPrice == rightPrice) {
				System.out.println("恭喜您，第" + i + "次就猜对了!\n获得了小米蓝牙耳机青春版精美礼品一份!");
				break;
			} else if ((5 - i) == 0)
				System.out.println("很抱歉，您的猜奖次数已用完，猜价抽奖活动已结束！");
			else if (guessPrice <= rightPrice)
				System.out.println("很遗憾，没有猜对，您猜的价格过低，再来吧！您还有" + (5 - i) + "次机会哦！");
			else if (guessPrice >= rightPrice)
				System.out.println("很遗憾，没有猜对，您猜的价格过低高，再来吧！您还有" + (5 - i) + "次机会哦！");
		}
	}
}
