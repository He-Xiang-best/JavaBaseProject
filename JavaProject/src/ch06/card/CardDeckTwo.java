package ch06.card;

public class CardDeckTwo extends CardDeck
{
	public CardDeckTwo()
	{
		super();
		for(int i=1;i<=9;i++)   //����Ĺ��췽���Ѿ�ϴ��һ���ƣ���������ϴ�Ŵ��ƣ�
		{
			shuffle();     //�̳и���ķ���
		}
	}
	
	public Card[] draw2()
	{
		Card[] c=new Card[2];
		c[0]=draw();           //�̳и���ķ���
		c[1]=draw();
		return c;
	}
}
	