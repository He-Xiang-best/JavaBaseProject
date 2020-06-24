package ex04;
/**
 * 
 * @content:课本例题J_Teacher的父类
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月7日上午11:55:14
 * @第一次修改的时间：
 * @time:2020年5月7日上午11:55:14
 * @修改原因：课堂测验，修改内容：
 */
public class J_Employee {
	public int m_workYear;

	public J_Employee() {
		m_workYear = 1;
	}
/**
 * 
 * @content：通过Getter与Setter方法设置并获取封装好的属性变量
 * @return
 */
	public int getM_workYear() {
		return m_workYear;
	}

	public void setM_workYear(int m_workYear) {
		this.m_workYear = m_workYear;
	}
}
