package ch03;

public class _12Person {
		private String name;
		private String gender;
		private int age;
		public _12Person() { //
		}
		public _12Person(String P_name, String P_gender, int P_age) {
			name = P_name;
			gender = P_gender;
			age = P_age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}	
	public String toString()
		{
			return "人是有姓名、年龄和性别特性，会思考的高级动物。";
		}
	}

