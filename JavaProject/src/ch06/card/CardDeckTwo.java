package ch06.card;

public class CardDeckTwo extends CardDeck
{
	public CardDeckTwo()
	{
		super();
		for(int i=1;i<=9;i++)   //父类的构造方法已经洗了一次牌，所以这里洗九次牌．
		{
			shuffle();     //继承父类的方法
		}
	}
	
	public Card[] draw2()
	{
		Card[] c=new Card[2];
		c[0]=draw();           //继承父类的方法
		c[1]=draw();
		return c;
	}
}
	