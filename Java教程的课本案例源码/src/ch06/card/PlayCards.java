package ch06.card;


public class PlayCards
{
	public static void main(String args[])
	{
		CardDeck d = new CardDeck();
		int i;
		int wins = 0;						//wins表示你赢的次数
		int rounds = 10;					//rounds表示玩牌次数
		
		for (i =1; i<=rounds; i++)
		{
			Card yours = d.draw();
			System.out.print("您的牌是: " + yours+" ，");
			Card mine = d.draw();
			System.out.print("我的牌是:" + mine+" 。 ");
			if (yours.rank() > mine.rank())
			{
				System.out.println("恭喜，您赢了！");
				wins++;
			}
			else
			{
				System.out.println("抱歉，我赢了。");
			}
		}
		System.out.println("您总共赢了:"+ wins+" 次");
	}
}