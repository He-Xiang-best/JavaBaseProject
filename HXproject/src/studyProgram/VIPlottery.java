package studyProgram;

import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @contend：VIP会员抽奖活动
 * @author： 何翔
 * @time： 2020年2月19日上午11:09:51
 */
public class VIPlottery {
private static Scanner input;
/*
 * 进入主页面后，输入您的名字，系统会自动帮您生成您的VIP号码，将您得到的号码输入进系统后，
 * 系统会自动帮您判断该号码是否中奖（内置中奖要求为：号码各位之和等于15才算中奖！）
 */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("您好，请输入您的姓名：");
		String name = input.next();
		Random number = new Random();//创建不带种子的随机数，每次运行生成的号码是随机的，无规律可言！
		System.out.println("我尊敬的 " + name + " 贵宾，您本次抽取的号码为：");
		for(int i = 0;i < 5;i++ ) {
			System.out.print(number.nextInt(10));
		}//打印0~9随机数，循环打印出一个五位数；
		System.out.println();
		System.out.println("请将您获得的抽奖码确认后输入，将为您查看您是否中奖");
		int num = input.nextInt();
		int oneplace = num % 10;
		int twoplace = num / 10 % 10;
		int threeplace = num / 100 % 10;
		int fourplace = num / 1000 % 10;
		int fiveplace = num / 10000 % 10;
		int sum = oneplace + twoplace + threeplace + fourplace + fiveplace;
		if(sum > 0 && sum==15)
			System.out.println("恭喜您，您的号码中奖了！获得了精美大礼包一份！祝贺您！");
		else
			System.err.println("很遗憾，您的号码没中奖，感谢您的参与！");
	}
	
}

