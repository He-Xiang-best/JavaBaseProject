package ex04_asia.china;
/**
 * 
 * @content:����һ����Employee,�����Ϊname��age;���Ϊasia.china
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��7������1:22:01
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��7������1:22:01
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Employee {
	private String name;
	private int age;
/**
 * ����Ĭ����Ϣ
 */
	public Employee() {
        name = "Nobody";
        age = 18;
	}
/**
 * ¼������Ϣ������Ĭ����Ϣ
 * @param name
 * @param age
 */
	public Employee(String name, int age) {
		this();
		setName(name);
		setAge(age);
	}
/**
 * @content��ͨ��Getter��Setter�������ò���ȡ��װ�õ����Ա���
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
