package ch03.multi;

public class NetTeacher extends Teacher{ 
	public NetTeacher(String myName, String myCenter) {
		super(myName, myCenter);
	}
	public void giveLesson(){
		System.out.println("����רҵ�ڿ�");
		super.giveLession();   

	}

}
