package ch06.card;
public class CardDeck				//����һ����
{
	private Card deck [];           //deck[]���һ����
	private int cards;				//cards��ʾ��ʣ������
	
	public CardDeck()               //���췽��������52���ƣ�������ֵ�ͻ�ɫ��ϴ��
	{
		deck = new Card[52];        //����52����
		fill();						//������ֵ�ͻ�ɫ
		shuffle();					//ϴ��
	}
	
	public void fill()				//������ֵ�ͻ�ɫ
	{
		int i;
		int j;
		
		for (i =1; i <= 13; i++)
			for (j = 1; j <= 4; j++)
				deck[4*(i-1) + j - 1]= new Card(i,j);
// deck[0]=�ݻ�A��deck[1]=����A��deck[2]=����A��deck[3]=����A,deck[4]=�ݻ�2...

		cards = 52;					//��ʼ��52����
	}
	
	public void shuffle()			//ϴ��
	{
		int next;
		for (next = 0 ; next < cards-1; next++)
		{
			int r=(int) (Math.random()*52);			//�������0--51��һ����
			Card temp = deck [next];				//�����ƽ���λ��
			deck[next] = deck[r];
			deck[r] = temp;
		}
	}
	
	public Card draw()								//��һ����
	{
		if (cards == 0) return null;
		cards--;
		return deck[cards];
	}
	
}