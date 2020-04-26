package ch06.card;
public class Card    //����һ����
{
	public static final int ACE = 1;       
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int CLUBS = 1;        	//�ݻ���С
	public static final int DIAMONDS = 2;     	//����
	public static final int HEARTS = 3;  	  	 //����
	public static final int SPADES = 4;      	 //�������
	
	private int value;                       	 //value��ʾ��ֵ��1--13
	private int suit;                         	//suit��ʾ��ɫ��1--4
	
	public Card(int v,int s)					//���췽����������ֵ�ͻ�ɫ			
	{
		value = v;
		suit = s;
	}
	
	public int getValue()						//������ֵ
	{
		return value;
	}
	
	public int getSuit()						//���ػ�ɫ
	{
		return suit;
	}
	
	public int rank()							//�����Ƶ�����
	{
		return 4*(value-1) +suit;
	}
	
	public String toString()					//����ֵ�ͻ�ɫת�����ַ���
	{
		String v;
		String s;
		if (value == ACE) v="A";
		else if (value == JACK) v= "J";
		else if (value == QUEEN) v="Q";
		else if (value == KING) v="K";
		else v=String.valueOf(value);
		if (suit == CLUBS) s = "�ݻ�";
		else if (suit == DIAMONDS) s = "����";
		else if (suit == HEARTS) s = "����";
		else s = "����";
		return s + " "+v;
	}

}