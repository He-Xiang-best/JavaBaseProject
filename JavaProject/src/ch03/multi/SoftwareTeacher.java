package ch03.multi;

public class SoftwareTeacher extends Teacher{ 
	public SoftwareTeacher(String myName, String myCenter) {
		super(myName, myCenter);
	}
	public void giveLesson(){
		System.out.println("ʹ�õ����ڿ�");
		super.giveLession();

	}
}

