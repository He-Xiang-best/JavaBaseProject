package ch02;

public class J_SwitchOld {
	
	
/*	public static void main(String[] args) {
		char javaScore='b';
		
		if((javaScore=='A') || (javaScore=='a'))
		{
			System.out.println("��");
		}
		else if((javaScore=='B') || (javaScore=='b'))
		{
			System.out.println("��");
		}
		else if((javaScore=='C') || (javaScore=='c'))
		{
			System.out.println("��");
		}
		else if(((javaScore=='D') || (javaScore=='d')))
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("������");
		}	
	}
*/
	
	public static void main(String[] args) {
		char javaScore='b';
		
		switch (javaScore){
		case 'A':
		case 'a':
			System.out.println("����");
			break;
		case 'B':
		case 'b':
			System.out.println("����");
			break;
		case 'C':
		case 'c':
			System.out.println("����");
			break;
		case 'D':
		case 'd':
			System.out.println("������");
			break;
		default:
		    System.out.println("�ɼ�����");			
		}
		int a=12;
		boolean i=(true||(++a==1))&(a==2);
		
		System.out.println(a*=2+3);
		System.out.println(a);
	}
}
