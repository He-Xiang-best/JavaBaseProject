package ex11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;




public class J_StudentOP {
	ArrayList<Student> st=new ArrayList<Student>();


	//�Ӽ����л��ѧ���ɼ�������Ϣ������һ��ѧ���б�
	public void inputStudents(){
		boolean flag=false;
		int gradeJava,gradeC;
		Scanner sc=new Scanner(System.in);
		System.out.println("������ѧ������");
		try{
			int n=sc.nextInt();

			if (n>0) {
				for(int i=0;i<n;i++){
					System.out.println("������ѧ��������java�ɼ���C�ɼ�");
					Student student=new Student();				
					student.setName(sc.next());
					gradeJava=input(sc);
					gradeC=input(sc);
					student.setGradeJava(gradeJava);
					student.setGradeC(gradeC);					
					st.add(student);
				}
			}//end for if
			else throw new Exception("�����Ƿ�");
		}catch(Exception e){
			System.out.print("����Ƿ�"+e);
		}
	}
	/*���մӼ�����������֣�
	**�����0-100�ķ���Ҫ��,��������
	**������ʾ�û���������ٴ�����
	*/	
	public int input(Scanner sc){
		int grade=0;
		boolean flag=true;
		do{				
		     grade=sc.nextInt();
				if ((grade>0)&&(grade<=100)){
					flag=false;
					break;
				}
				else {
					System.out.print("����Ҫ��0-100֮�䣬����������");
				}
		}while(flag);	
		return grade;
	}

	//��ѧ������д��ָ�����ļ���
	public void writeStudent(String file){
		ObjectOutputStream f_out=null;
		try{
			f_out= new ObjectOutputStream(new FileOutputStream((file)));
			for(Student s:st)
				f_out.writeObject(s);
		}catch(Exception ex){
			System.out.print(ex);
		}
	}

	//���ļ��ж�����������
	public ArrayList<Student> readStudents(String file){
		ObjectInputStream f;

		try {
			f = new ObjectInputStream(
					new FileInputStream(file));
			Student s;
			do{	
				s = new Student();
				s=	(Student)(f.readObject( ));
				if(s!=null) {
					st.add(s);
					System.out.println(s);
				}
			}while (s!=null);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (Exception e) {
			System.out.print(e);
		}
		return st;   
	}

	//����ƽ���ɼ�
	public void averageStudent(){
		for (Student s:st){
			s.average();
			System.out.print(s);
			System.out.print("ƽ���ɼ�"+s.getAverage());
			System.out.println();
		}
	}
	//��ӡѧ���ɼ�
	public void printStudent(){
		for (Student s:st){
			System.out.println(s);
		}
	}

}
