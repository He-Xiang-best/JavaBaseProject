package ch06.card;


public class PlayCards
{
	public static void main(String args[])
	{
		CardDeck d = new CardDeck();
		int i;
		int wins = 0;						//wins��ʾ��Ӯ�Ĵ���
		int rounds = 10;					//rounds��ʾ���ƴ���
		
		for (i =1; i<=rounds; i++)
		{
			Card yours = d.draw();
			System.out.print("��������: " + yours+" ��");
			Card mine = d.draw();
			System.out.print("�ҵ�����:" + mine+" �� ");
			if (yours.rank() > mine.rank())
			{
				System.out.println("��ϲ����Ӯ�ˣ�");
				wins++;
			}
			else
			{
				System.out.println("��Ǹ����Ӯ�ˡ�");
			}
		}
		System.out.println("���ܹ�Ӯ��:"+ wins+" ��");
	}
}