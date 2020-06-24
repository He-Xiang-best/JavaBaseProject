package ch03.multi;


public class SchoolManager {
	/*public void manage(Teacher t){
		t.introduction();
		t.giveLession();
	}*/
	public void manage(SoftwareTeacher st){
		st.introduction();
		st.giveLesson();
		}
		public void manage (CallTeacher ct){
		ct.introduction();
		ct.giveLesson();
		}

	public static void main(String[] args) { 
		SchoolManager cm = new SchoolManager ();
		cm. manage(new SoftwareTeacher ("张三","软件专业"));
		cm. manage(new CallTeacher ("张明","呼叫专业"));
	}
}

