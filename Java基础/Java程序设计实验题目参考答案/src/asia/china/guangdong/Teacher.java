package asia.china.guangdong;
import asia.china.Employee;
/**
 * ����һ����Teacher,���Ϊasia.china.guangdong��
 * �����Ϊ�������ޣ�workYears����ְ��(jobTitle)��
 * Teacher��̳�Employee�� * 
 * @author ������
 * @since JDK1.6
 * @version 1.0
 * @since 2017.3.30
 */
public class Teacher extends Employee
{
	protected int workYears;
	protected String jobTitle;
	public Teacher(int workYears,String jobTitle,String name,int age)
	{
		this.name=name;
		this.age=age;
		this.workYears=workYears;
		this.jobTitle=jobTitle;
		
	}
	public int getWorkYears()
	{
		return workYears;
	}
	public String getJobTitle()
	{
		return jobTitle;
	}
	public void setWorkYears(int workYears) {
		this.workYears = workYears;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
}
