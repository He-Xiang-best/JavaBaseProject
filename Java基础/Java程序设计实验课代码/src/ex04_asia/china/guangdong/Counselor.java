package ex04_asia.china.guangdong;

import ex04_asia.china.Employee;

/**
 * 
 * @content:在程序中增加一个辅导员类（Counsellor）继承Employee，类包为asia.china.guangdong,
 *          域变量为所在学院（college），与所在年级（Level）；成员方法包括构造方法与getter方法。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月13日上午10:35:22
 * @第一次修改的时间：
 * @time:2020年5月13日上午10:35:22
 * @修改原因：课堂测验，修改内容：
 */
public class Counselor extends Employee{
	/*
	 * 设置域变量为所在学院（college），与所在年级（Level）
	 */
	private String college;
	private String level;
	/*
	 * 构造方法：设置默认信息
	 */
	
	public Counselor() {
		college = "未知学院";
		level = "研究生";
	}
	/**
	 * 录入新信息，覆盖默认信息
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
	 * @content：通过Getter与Setter方法设置并获取封装好的属性变量
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
