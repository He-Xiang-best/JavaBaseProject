package ch06.card;
public class AnotherPlayCards
{
	public static void main(String args[])
	{
		CardDeckTwo d = new CardDeckTwo();
		int i;
		int wins = 0;						//wins表示你赢的次数
		int rounds = 10;					//rounds表示玩牌次数
		
		for (i =1; i<=rounds; i++)
		{
			Card [] yours = d.draw2();
			System.out.print("您的牌是: " + yours[0]+" ，"+yours[1]+"；   ");
			Card [] mine = d.draw2();
			System.out.print("我的牌是:" + mine[0]+" ， "+mine[1]+"。    ");
			int yourValue=yours[0].getValue()+yours[1].getValue();
		    int myValue=mine[0].getValue()+mine[1].getValue();
		    int yourSuit=yours[0].getSuit()+yours[1].getSuit();
		    int mySuit=mine[0].getSuit()+mine[1].getSuit();
			if ((yourValue> myValue)||((yourValue==myValue) && (yourSuit>mySuit)))
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