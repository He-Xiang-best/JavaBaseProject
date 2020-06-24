package ex04;
/**
 * @content:完成并理解书中71页的J_Teacher.java例题
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月7日上午11:40:03
 * @第一次修改的时间：
 * @time:2020年5月7日上午11:40:03
 * @修改原因：课堂测验，修改内容：
 */
public class J_Teacher extends J_Employee {
	//定义Teacher自己的属性——教学时长
	public int m_classHour;
    //通过构造函数初始化成员变量
	public J_Teacher() {
		m_classHour = 96;
	}
	//通过重写父类的方法，拓展自身的功能：
	public void mb_printInfo() {
		System.out.println("该教师的工作年限为：" + m_workYear);
		System.out.println("该教师授课的课时为：" + m_classHour);
	}
/**
 * 
 * @content：通过Getter与Setter方法设置并获取封装好的属性变量
 * @return
 */
	public int getM_classHour() {
		return m_classHour;
	}

	public void setM_classHour(int m_classHour) {
		this.m_classHour = m_classHour;
	}
	
}
