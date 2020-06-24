package ex04;
/**
 * 
 * @content:作为Student类的案例对比以及实现参考
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月7日下午1:06:54
 * @第一次修改的时间：
 * @time:2020年5月7日下午1:06:54
 * @修改原因：课堂测验，修改内容：
 */
public class Teacher extends People {
	public int workTime;
	/*
     * 通过构造函数初始化成员变量，作为无信息录入时的默认信息
     */
    public Teacher() {
    	workTime = 0;
    }
    /*
     * 自定义信息：
     */
    public Teacher(String name ,String id,int age,int workTime) {
  	    super(name, id, age);
    	setWorkTime(workTime);
    }
    /**
     * 
     * @content：通过Getter与Setter方法设置并获取封装好的属性变量
     * @return
     */
	public int getWorkTime() {
		return workTime;
	}
	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
}
