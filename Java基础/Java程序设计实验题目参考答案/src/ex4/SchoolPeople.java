package ex4;
/**
* 实验四 面向对象程序设计
* 第一题，不能继承就重新创建继承关系
* Teacher、Student及其父类
*@author 郭晓燕
*@version 2.0
*@since J2SE1.7
*2017.3.29
*/

/**
 * 学生类，父类是SchoolPeople
 * @author Administrator
 *
 */
class Student extends SchoolPeople{
	private String year;//入学时间
	private String society;//参加社团
	
	public Student(){
		name="某某";
		school="吉林大学珠海学院";
		year="2015-9-1";
		society="朗诵";
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSociety() {
		return society;
	}
	public void setSociety(String society) {
		this.society = society;
	}
	/**
	 * 打印学生类基本信息
	 */
	public void printInfo(){
		System.out.println(name+"同学");
		System.out.println("参加"+society+"社团");
	}

}
/**
 * 教师类，父类SchoolPeople
 * @author 郭晓燕
 *
 */
class Teacher extends SchoolPeople{

	private int year;//工作开始时间
	private String title;//职务职称
	
	public Teacher(){
		name="某某";
		school="吉林大学珠海学院";
		year=1;
		title="讲师";
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void printInfo(){
		System.out.println(school+name+title);
		System.out.println("在学校工作"+year+"年");
	}
	
}
/**
 * 学生与教师的共同父类SchoolPeople类
 * @author Administrator
 *
 */
public class SchoolPeople {
	String number;
	String name;
	String school;	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	

	public void printInfo(){
		System.out.println("号码"+number+"姓名"+name);
		System.out.println("所在学校"+school);
	}
}
