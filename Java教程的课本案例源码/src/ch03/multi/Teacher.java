package ch03.multi;

public class Teacher {
	private String name; //��ʦ����
	private String center; //���ڵ�λ
	public Teacher(String myName, String myCenter) {
	name = myName; 
	center = myCenter;
	}
	public void giveLession(){
	System.out.println("֪ʶ�㽲��");
	}
	public void introduction() {
		System.out.println("��Һã�����"+ center + "��" + name + ".");
	         }
	}
