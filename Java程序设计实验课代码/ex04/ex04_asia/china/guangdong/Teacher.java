package ex04_asia.china.guangdong;

import ex04_asia.china.Employee;
/**
 * 
 * @content:生成一个类Teacher, 继承Employee类；类包为asia.china.guangdong 
 *          域变量为工作年限（workYears）和职称(jobTitle)；成员方法包括构造方法与getter方法； 
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月7日下午1:24:54
 * @第一次修改的时间：
 * @time:2020年5月7日下午1:24:54
 * @修改原因：课堂测验，修改内容：
 */
public class Teacher extends Employee {
	private int workYear;
	private String jobTitle;
	/**
	 * 设置默认信息
	 */
	public Teacher() {
		super();
		workYear = 0;
		jobTitle = "普通教师";
	}
	/**
	 * 录入新信息，覆盖默认信息
	 * @param name
	 * @param age
	 * @param workYear
	 * @param jobTitle
	 */
	public Teacher(String name,int age,int workYear,String jobTitle) {
		super(name, age);
		setWorkYear(workYear);
		setJobTitle(jobTitle);
	}
	/**
	 * 
	 * @content：通过Getter与Setter方法设置并获取封装好的属性变量
	 * @return
	 */
	public int getWorkYear() {
		return workYear;
	}

	public void setWorkYear(int workYear) {
		this.workYear = workYear;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	

}
