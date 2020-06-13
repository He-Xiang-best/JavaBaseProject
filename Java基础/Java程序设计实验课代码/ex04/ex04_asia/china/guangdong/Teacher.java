package ex04_asia.china.guangdong;

import ex04_asia.china.Employee;
/**
 * 
 * @content:����һ����Teacher, �̳�Employee�ࣻ���Ϊasia.china.guangdong 
 *          �����Ϊ�������ޣ�workYears����ְ��(jobTitle)����Ա�����������췽����getter������ 
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��7������1:24:54
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��7������1:24:54
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Teacher extends Employee {
	private int workYear;
	private String jobTitle;
	/**
	 * ����Ĭ����Ϣ
	 */
	public Teacher() {
		super();
		workYear = 0;
		jobTitle = "��ͨ��ʦ";
	}
	/**
	 * ¼������Ϣ������Ĭ����Ϣ
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
	 * @content��ͨ��Getter��Setter�������ò���ȡ��װ�õ����Ա���
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
