package ex4;
/**
* ʵ���� �������������
* ��һ�⣬���ܼ̳о����´����̳й�ϵ
* Teacher��Student���丸��
*@author ������
*@version 2.0
*@since J2SE1.7
*2017.3.29
*/

/**
 * ѧ���࣬������SchoolPeople
 * @author Administrator
 *
 */
class Student extends SchoolPeople{
	private String year;//��ѧʱ��
	private String society;//�μ�����
	
	public Student(){
		name="ĳĳ";
		school="���ִ�ѧ�麣ѧԺ";
		year="2015-9-1";
		society="����";
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
	 * ��ӡѧ���������Ϣ
	 */
	public void printInfo(){
		System.out.println(name+"ͬѧ");
		System.out.println("�μ�"+society+"����");
	}

}
/**
 * ��ʦ�࣬����SchoolPeople
 * @author ������
 *
 */
class Teacher extends SchoolPeople{

	private int year;//������ʼʱ��
	private String title;//ְ��ְ��
	
	public Teacher(){
		name="ĳĳ";
		school="���ִ�ѧ�麣ѧԺ";
		year=1;
		title="��ʦ";
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
		System.out.println("��ѧУ����"+year+"��");
	}
	
}
/**
 * ѧ�����ʦ�Ĺ�ͬ����SchoolPeople��
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
		System.out.println("����"+number+"����"+name);
		System.out.println("����ѧУ"+school);
	}
}
