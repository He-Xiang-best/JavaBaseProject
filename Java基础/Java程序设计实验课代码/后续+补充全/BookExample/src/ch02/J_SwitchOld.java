package ch02;

public class J_SwitchOld {
	
	
/*	public static void main(String[] args) {
		char javaScore='b';
		
		if((javaScore=='A') || (javaScore=='a'))
		{
			System.out.println("优");
		}
		else if((javaScore=='B') || (javaScore=='b'))
		{
			System.out.println("良");
		}
		else if((javaScore=='C') || (javaScore=='c'))
		{
			System.out.println("中");
		}
		else if(((javaScore=='D') || (javaScore=='d')))
		{
			System.out.println("及格");
		}
		else
		{
			System.out.println("不及格");
		}	
	}
*/
	
	public static void main(String[] args) {
		char javaScore='b';
		
		switch (javaScore){
		case 'A':
		case 'a':
			System.out.println("优秀");
			break;
		case 'B':
		case 'b':
			System.out.println("良好");
			break;
		case 'C':
		case 'c':
			System.out.println("及格");
			break;
		case 'D':
		case 'd':
			System.out.println("不及格");
			break;
		default:
		    System.out.println("成绩有误");			
		}
		int a=12;
		boolean i=(true||(++a==1))&(a==2);
		
		System.out.println(a*=2+3);
		System.out.println(a);
	}
}
