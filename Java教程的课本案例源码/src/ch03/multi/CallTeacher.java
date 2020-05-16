package ch03.multi;


public class CallTeacher extends Teacher{ 
	public CallTeacher(String myName, String myCenter) {
		super(myName, myCenter);
	}
	public void giveLesson(){
		System.out.println("ºô½Ð×¨ÒµÊÚ¿Î");
		super.giveLession();   

	}


}
