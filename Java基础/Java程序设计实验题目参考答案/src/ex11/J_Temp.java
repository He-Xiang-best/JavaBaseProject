package ex11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class J_Temp {
	ArrayList<Student> st=new ArrayList<Student>();


	//�Ӽ����л��ѧ���ɼ�������Ϣ������һ��ѧ���б�
	public void inputStudents(){
		Scanner sc=new Scanner(System.in);
		System.out.println("������ѧ������");
		try{
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
				//ѭ���ѻ��ÿ��ѧ���Ļ�����Ϣ
			}
		}catch(Exception e){
			System.out.print(e);
		}

	}

	//��ѧ������д��ָ�����ļ���
	public void writeStudent(String file){
		ObjectOutputStream f_out=null;
		try{
			//���б�д���ļ�
		}catch(Exception ex){
			System.out.print(ex);
		}
	}
	
	//���ļ��ж�����������
	public ArrayList<Student> readStudents(String file){
		ObjectInputStream f;

		try {
			//���ļ����ȡ��Ϣ���������д������б���
		} catch (Exception e) {
			System.out.print(e);
		}
		return st;   
	}

	//����ƽ���ɼ�
	public void averageStudent(){
		//����ƽ���ɼ�������С���к������
	}
	//��ӡѧ���ɼ�
	public void printStudent(){
		for (Student s:st){
			System.out.println(s);
		}
	}

}
