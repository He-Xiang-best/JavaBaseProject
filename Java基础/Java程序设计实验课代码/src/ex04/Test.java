package ex04;
/**
 * 
 * @content:��ʵ��4��1���������Ŀ�Ĳ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��7������12:44:54
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��7������12:44:54
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("Part1����ʵ��4��1���1С�ʣ�");
		//��ɲ��������71ҳ��J_Teacher.java����
		J_Teacher teacher1 = new J_Teacher();
		teacher1.mb_printInfo();
		//�����ʽ����ת������ʽ����ת��������:
		/*
		 ��ʽ����ת��:
		J_Employee employee = teacher1;
		 ǿ������ת��:
		System.out.println(((J_Employee) teacher1).m_workYear);
		 ��ʾ����ת��:
		J_Teacher teacher2 = (J_Teacher) employee;
		*/
		System.out.println("==================================================================");
		System.out.println("Part2����ʵ��4��1���2С�ʣ�\nStudent��");
		//�����ڹ��캯�������ô�ӡ������Ϊ��ֱ�۸��ܣ���ֱ�Ӵ�ӡ�������飺һ��û������Ϣ��һ����������Ϣ
		printS(new Student());
		printS(new Student("����","04191315",19,17));		
		System.out.println("Teacher��");
        printT(new Teacher());
        printT(new Teacher("�������","2004",50,30));
	}
	/*
	 * �ֱ��ӡ�����Ϣ���������ö�̬��ʵ����Ϣ�Ĵ�ӡ��
	 */
	public static void printS(Student student) {
		System.out.println("������" + student.getName() + " , ѧ��Ϊ��"+student.getId()+" , ����"+
				student.getAge()+"��"+" , ѧϰʱ��Ϊ��"+student.getStudyTime()+"��");
	}
    public static void printT(Teacher teacher) {
    	System.out.println("�ڿν�ʦ��"+teacher.getName()+" , ��ְ���ţ�"+teacher.getId()+" , ��ͣ�"+
        		teacher.getAge()+"��"+" , ��ѧʱ����"+teacher.getWorkTime()+"��");
    }
}
