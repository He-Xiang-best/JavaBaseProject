//package ex08;
//
//import java.util.HashMap;
//import java.util.Scanner;
////04191412�����
////��һ�����ʱ��Ϊ0604_10:50
////��һ�����ʱ��Ϊ0604_10:50 �޸�ԭ���޸�ԭ�򣺿��ò��飬�޸����ݣ��ж�ѧ��
///**
// * ��Ŀ1
// *  for���ļ򻯣��������飬��д������������������
// *	�½�һ��ѧ��Student�࣬���԰���ѧ�š���������ѧ��Ӣ��ͼ�������ſγ̳ɼ���ƽ����
// *	�½�һ��ѧ���༶��StudentClass����������һ��ѧ�����鳤��Ϊ5������5��ѧ��Student
// *	�ڹ��췽�����½�5λѧ���Ļ�����Ϣ��Ҫ�����ͨ�������������޸�ѧ����ѧ�š�ƽ����֮�����Ϣ
// *	Ҫ�������м���ѧ��ƽ���ֲ��������ÿλѧ����ѧ�š�������ƽ����
// */
//public class StudentClass2 {
//	
//	// ��ϣ�� keyΪѧ�� valueΪѧ��
//	public HashMap<String, Student> students;
//	
//	public StudentClass2() {
//		students = new HashMap<String, Student>();
//		students.put("12311539", new Student2("12311539", "СA", 65, 85, 95));
//		students.put("14511539", new Student2("14511539", "СB", 80, 90, 90));
//		students.put("12455391", new Student2("12455391", "СC", 90, 85, 80));
//		students.put("12411539", new Student2("12411539", "СD", 80, 85, 90));
//		students.put("12311889", new Student2("12311889", "СE", 80, 85, 75));
//	}
//	
//	//��ӡ����ѧ��
//	public void printStudents() {
//		students.values().forEach(System.out::println);
//	}
//	
//	public static void main(String[] args) {
//		
//		StudentClass stuClass = new StudentClass();
//		
//		@SuppressWarnings("resource")
//		Scanner sca = new Scanner(System.in);
//		
//		stuClass.printStudents();
//		
//		while (true) {
//			
//			try {
//				
//				System.out.println("������ѧ����Ϣ�Ӷ��޸Ļ����: (ѧ�� ���� ��ѧ�ɼ� Ӣ��ɼ� ������ɼ�)");
//				
//				String   id       = sca.next();
//				String   name     = sca.next();
//				int      math     = Integer.parseInt(sca.next());
//				int      english  = Integer.parseInt(sca.next());
//				int      computer = Integer.parseInt(sca.next());
//				
//				if (!id.matches("\\d+")) {
//					throw new IllegalArgumentException("ѧ�ű���Ϊ����");
//				}
//				
//				if (id.length() != 8) {
//					throw new IllegalArgumentException("ѧ�ű���Ϊ8λ��");
//				}
//
//				if (id.startsWith("04")) {
//					System.out.println("�Ǽ����ѧԺѧ��");
//				}
//				
//				stuClass.students2.put(id, new Student2(id, name, math, english, computer));
//				
//				stuClass.printStudents();
//			}
//			catch(IllegalArgumentException exce) {
//				
//				System.out.println("�����쳣:"+exce.getMessage());
//				
//			}
//		}
//		
//	}
//}
//
