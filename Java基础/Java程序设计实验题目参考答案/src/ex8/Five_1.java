package ex8;

import java.util.Scanner;
/**
 * �ڰ˴�ʵ��
 * ������ ���͡�ö�ٺ͵ݹ�
 * @author ������
 *
 */
public class Five_1 {
	Five_1_Student[]  students;
	
	/**
	 * ��ʼ��������ѧ������ÿ��Ԫ�صĻ�����Ϣ
	 * @throws Exception
	 */
	public   Five_1(){
		students=new Five_1_Student[3];
	}
    public void init() throws Exception{
		String inputs;
		int input,grade1,grade2,grade3;
		
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<students.length;i++){
		
			System.out.print("������ѧ��");
			input=sc.nextInt();
			System.out.print("����������");
			inputs=sc.next();
			students[i]=new Five_1_Student(input,inputs);
			//û�д����쳣���
			System.out.print("������ɼ�1");
			grade1=sc.nextInt();		
			System.out.print("������ɼ�2");
			grade2=sc.nextInt();		
		
			System.out.print("������ɼ�3");
			grade3=sc.nextInt();
		
			students[i].setGrade1(grade1);
			students[i].setGrade2(grade2);
			students[i].setGrade3(grade3);
			
		}
		
	}
	/**
	 * ��ӡѧ���Ļ������
	 */
	public void printInfo(){
		int i=1;
		
		for (Five_1_Student s:students){
			System.out.println
			("��"+i+"��ѧ��ѧ��"+s.getId());
			System.out.print("����"+s.getName());
			System.out.print("ƽ���ɼ�"+s.getAverage());
			System.out.println();
			i++;
			
		}
	}
	
	public static void main(String[] args) {
		Five_1 five=new Five_1();
		try{
			five.init();
		}catch(Exception e){
			System.out.println(e);
		}
		five.printInfo();
	}	
}
