package ch06.card;
public class Card    //定义一张牌
{
	public static final int ACE = 1;       
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int CLUBS = 1;        	//草花最小
	public static final int DIAMONDS = 2;     	//方块
	public static final int HEARTS = 3;  	  	 //红桃
	public static final int SPADES = 4;      	 //黑桃最大
	
	private int value;                       	 //value表示牌值：1--13
	private int suit;                         	//suit表示花色：1--4
	
	public Card(int v,int s)					//构造方法：设置牌值和花色			
	{
		value = v;
		suit = s;
	}
	
	public int getValue()						//返回牌值
	{
		return value;
	}
	
	public int getSuit()						//返回花色
	{
		return suit;
	}
	
	public int rank()							//返回牌的排序
	{
		return 4*(value-1) +suit;
	}
	
	public String toString()					//将牌值和花色转换成字符串
	{
		String v;
		String s;
		if (value == ACE) v="A";
		else if (value == JACK) v= "J";
		else if (value == QUEEN) v="Q";
		else if (value == KING) v="K";
		else v=String.valueOf(value);
		if (suit == CLUBS) s = "草花";
		else if (suit == DIAMONDS) s = "方块";
		else if (suit == HEARTS) s = "红桃";
		else s = "黑桃";
		return s + " "+v;
	}

}