package ex04_asia.china.guangdong;

import ex04_asia.china.Employee;

/**
 * 
 * @content:�ڳ���������һ������Ա�ࣨCounsellor���̳�Employee�����Ϊasia.china.guangdong,
 *          �����Ϊ����ѧԺ��college�����������꼶��Level������Ա�����������췽����getter������
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��13������10:35:22
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��13������10:35:22
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Counselor extends Employee{
	/*
	 * ���������Ϊ����ѧԺ��college�����������꼶��Level��
	 */
	private String college;
	private String level;
	/*
	 * ���췽��������Ĭ����Ϣ
	 */
	
	public Counselor() {
		college = "δ֪ѧԺ";
		level = "�о���";
	}
	/**
	 * ¼������Ϣ������Ĭ����Ϣ
	 * @param name
	 * @param age
	 * @param college
	 * @param level
	 */
	public Counselor(String name,int age,String college,String level) {
		super(name, age);
		setCollege(college);
		setLevel(level);
	}
	/**
	 * 
	 * @content��ͨ��Getter��Setter�������ò���ȡ��װ�õ����Ա���
	 * @return
	 */
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

}
