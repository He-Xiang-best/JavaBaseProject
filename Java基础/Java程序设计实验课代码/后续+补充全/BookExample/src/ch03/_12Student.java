package ch03;

public class _12Student extends _12Person{

	/**
	 * @param args
	 */
	private String stuID;
	private String department;
	public _12Student(){
		super();
	}
	public _12Student(String stuName, String stuGen, int stuAge,String stuid,String depart)
	{
		setName(stuName);
		setGender(stuGen);
		setAge(stuAge);
		stuID=stuid;
		department=depart;
	}
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String toString()
	{
		return "学生的名字是"+getName()+",学生的学号为"+stuID;
	}
	public String showStudent()
	{
		return "学生的年龄为"+getAge()+",学生的性别为"+getGender();
	}

	public static void main(String[] args) {
		_12Student zhangsan=new _12Student("张三","男",20,"04050720","计算机");
		System.out.println(zhangsan);
		System.out.println(zhangsan.showStudent());


	}

}
