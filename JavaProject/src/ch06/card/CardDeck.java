package ch06.card;
public class CardDeck				//定义一付牌
{
	private Card deck [];           //deck[]存放一付牌
	private int cards;				//cards表示还剩几张牌
	
	public CardDeck()               //构造方法：创建52张牌，填上牌值和花色，洗牌
	{
		deck = new Card[52];        //创建52张牌
		fill();						//填上牌值和花色
		shuffle();					//洗牌
	}
	
	public void fill()				//填上牌值和花色
	{
		int i;
		int j;
		
		for (i =1; i <= 13; i++)
			for (j = 1; j <= 4; j++)
				deck[4*(i-1) + j - 1]= new Card(i,j);
// deck[0]=草花A，deck[1]=方块A，deck[2]=红桃A，deck[3]=黑桃A,deck[4]=草花2...

		cards = 52;					//开始有52张牌
	}
	
	public void shuffle()			//洗牌
	{
		int next;
		for (next = 0 ; next < cards-1; next++)
		{
			int r=(int) (Math.random()*52);			//随机生成0--51的一个数
			Card temp = deck [next];				//两张牌交换位置
			deck[next] = deck[r];
			deck[r] = temp;
		}
	}
	
	public Card draw()								//发一张牌
	{
		if (cards == 0) return null;
		cards--;
		return deck[cards];
	}
	
}