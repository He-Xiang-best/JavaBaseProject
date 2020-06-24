package ex04_asia.china;
/**
 * 
 * @content:生成一个类Employee,域变量为name和age;类包为asia.china
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月7日下午1:22:01
 * @第一次修改的时间：
 * @time:2020年5月7日下午1:22:01
 * @修改原因：课堂测验，修改内容：
 */
public class Employee {
	private String name;
	private int age;
/**
 * 设置默认信息
 */
	public Employee() {
        name = "Nobody";
        age = 18;
	}
/**
 * 录入新信息，覆盖默认信息
 * @param name
 * @param age
 */
	public Employee(String name, int age) {
		this();
		setName(name);
		setAge(age);
	}
/**
 * @content：通过Getter与Setter方法设置并获取封装好的属性变量
 * @return
 */
	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
