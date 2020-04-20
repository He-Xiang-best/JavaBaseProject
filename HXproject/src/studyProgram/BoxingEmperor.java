package studyProgram;

import java.util.Scanner;
/**
 * 
 * @content:简单的拳皇游戏
 * @author:何翔
 * @time:2020年2月21日下午9:45:29
 */
public class BoxingEmperor {
//	private static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("登入游戏成功！\n\n欢迎来到游戏——抗疫战争！");//\n请选择：1.登入游戏\t\t2.退出游戏");
		//int choose = input.nextInt();
		//if(choose==2)
			//System.exit(0); 
		System.out.println("\n请自定义一个你喜欢的名称吧：");
		String name = input.nextLine();
		String computername = "新冠肺炎病毒";
		System.out.println("下面进行抗疫战斗：\t "+name+"  Hp■■■■■■■■■■\tVS\t"+computername+"  Hp■■■■■■■■■■");
		System.out.println("=========================================================================================================================");
		int hp1 = 100,hp2 = 100,attact1 = 0,attact2 = 0;
		for(int i = 1;hp1 >= 0&&hp2 >= 0;i++) {
			if(hp2<=0||hp1<=0)
				break;
			System.out.println("\n第"+i+"轮挑战！");
			System.out.println(name+"勇士请选择招数：1.口罩隔杀 \t\t2.喷射消毒剂     \t\t3.强身健体");
			int zhaoshu1 = input.nextInt();
			if(hp2<=0||hp1<=0)
				break;
			switch (zhaoshu1) {
			case 1:
				attact1 = (int)(Math.random() * 10000) % 11 + 15;
				hp2 -= attact1;
				if(hp2>0)
				System.out.println(name+"打出了口罩隔杀的招式！攻击力为："+attact1+"\t\t"+computername+"的体力值-"+attact1+" ,还剩"+hp2+"血量");
				else
                System.out.println(name+"打出了口罩隔杀的招式！攻击力为："+attact1+"\t\t"+computername+"的体力值-"+attact1+" ，被KO，血量为0，已阵亡！");
				break;
			case 2:
				attact1 = (int)(Math.random() * 10000) % 11 + 15;
				hp2 -= attact1;
				if(hp2>0)
				System.out.println(name+"打出了喷洒消毒剂的招式！攻击力为："+attact1+"\t\t"+computername+"的体力值-"+attact1+" ,还剩"+hp2+"血量");
				else
                System.out.println(name+"打出了喷洒消毒剂的招式！攻击力为："+attact1+"\t\t"+computername+"的体力值-"+attact1+" ，被KO，血量为0，已阵亡！");
				break;
			case 3:
				attact1 = (int)(Math.random() * 10000) % 11 + 15;
				hp2 -= attact1;
				if(hp2>0)
				System.out.println(name+"打出了强身健体的招式！攻击力为："+attact1+"\t\t"+computername+"的体力值-"+attact1+" ,还剩"+hp2+"血量");
				else
                System.out.println(name+"打出了强身健体的招式！攻击力为："+attact1+"\t\t"+computername+"的体力值-"+attact1+" ，被KO，血量为0，已阵亡！");
				break;
				default:
					System.err.println("出招失败，抗击无效！");
			}
			System.out.println();
			if(hp1<=0||hp2<=0)
				break;
			System.out.println(computername+"迅速发起反击！(☄ฺ◣ω◢)☄ฺ\n");
         int zhaoshu2 = (int)(Math.random() * 10000) % 3 + 1;
         switch (zhaoshu2) {
			case 1:
				attact2 = (int)(Math.random() * 10000) % 11 + 15;
				hp1 -= attact2;
				if(hp1>0)
				System.out.println(computername+"打出了使你发热的招式！攻击力为："+attact2+"\t\t"+name+"的体力值-"+attact2+" ,还剩"+hp1+"血量");
				else
					System.out.println(computername+"打出了使你发热的招式！攻击力为："+attact2+"\t\t"+name+"的体力值-"+attact2+" ，被KO，血量为0，已阵亡！");	
				break;
			case 2:
				attact2 = (int)(Math.random() * 10000) % 11 + 15;
				hp1 -= attact2;
				if(hp1>0)
				System.out.println(computername+"打出了使你呼吸困难的招式！攻击力为："+attact2+"\t\t"+name+"的体力值-"+attact2+" ,还剩"+hp1+"血量");
				else
					System.out.println(computername+"打出了使你呼吸困难的招式！攻击力为："+attact2+"\t\t"+name+"的体力值-"+attact2+" ，被KO，血量为0，已阵亡！");	
				break;
			case 3:
				attact2 = (int)(Math.random() * 10000) % 11 + 15;
				hp1 -= attact2;
				if(hp1>0)
				System.out.println(computername+"打出了使你全身乏力的招式！攻击力为："+attact2+"\t\t"+name+"的体力值-"+attact2+" ,还剩"+hp1+"血量");
				else
					System.out.println(computername+"打出了使你全身乏力的招式！攻击力为："+attact2+"\t\t"+name+"的体力值-"+attact2+" ，被KO，血量为0，已阵亡！");	
				break;
				}
				System.out.println("=============================================================================================================");	
         }

			if(hp1<=0&&hp2>0)
				System.out.println(name+"挑战"+computername+"失败(╥╯^╰╥)！\t"/*+computername+"还剩余"+hp2+"血量"*/);
			else
				System.err.println("恭喜"+name+"勇士战胜"+computername+"！(oﾟ▽ﾟ)o  \t"/*+name+"您目前还剩余"+hp1+"血量*/+"\n武汉加油!中国必胜！d=====(￣▽￣*)b ");
		  input.close();
	}
	}
		



