package ch06.card;
public class AnotherPlayCards
{
	public static void main(String args[])
	{
		CardDeckTwo d = new CardDeckTwo();
		int i;
		int wins = 0;						//wins��ʾ��Ӯ�Ĵ���
		int rounds = 10;					//rounds��ʾ���ƴ���
		
		for (i =1; i<=rounds; i++)
		{
			Card [] yours = d.draw2();
			System.out.print("��������: " + yours[0]+" ��"+yours[1]+"��   ");
			Card [] mine = d.draw2();
			System.out.print("�ҵ�����:" + mine[0]+" �� "+mine[1]+"��    ");
			int yourValue=yours[0].getValue()+yours[1].getValue();
		    int myValue=mine[0].getValue()+mine[1].getValue();
		    int yourSuit=yours[0].getSuit()+yours[1].getSuit();
		    int mySuit=mine[0].getSuit()+mine[1].getSuit();
			if ((yourValue> myValue)||((yourValue==myValue) && (yourSuit>mySuit)))
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