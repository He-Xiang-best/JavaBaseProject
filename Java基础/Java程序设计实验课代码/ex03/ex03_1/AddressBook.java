package ex03_1;

import java.util.Scanner;
/**
 * @content:
        编码实现一个地址簿类（AddressBook)，即新建一个类文件AddressBook.java
	在该类中定义“姓名（name）”、“地址(address)”、“电话(tel)”三个域变量；
	通过getter方法和setter方法分别获取和设置对象的三个信息；
	通过getAllInfo()来进行对象所有三个信息的输入与输出。
 * @author:04191315何翔
 * @time:2020年4月28日下午11:11:05
 */
public class AddressBook {
	/**
	 *Function:在该类中定义“姓名（name）”、“地址(address)”、“电话(tel)”三个域变量
	 */
	private String name;
	private String address;
	private long tel;
	private Scanner input;


	public String getName() {
		return name;
	}
/**
 * 通过构造函数间接调用getter方法和setter方法分别获取和设置对象的三个信息；
 */
	public AddressBook() {
		input = new Scanner(System.in);
		System.out.println("请输入您姓名：");
		name = input.nextLine();
		setName(name);
		System.out.println("请输入您的地址：");
		address = input.nextLine();
		setAddress(address);
		System.out.println("请输入您的电话号码：");
		tel = input.nextLong();
		setTel(tel);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	/**
	 * @content：
	      通过getAllInfo()方法进行对象所有三个信息的输入与输出
	 * @return
	 */
	public void getAllinfo() {
		System.out.println("姓名：" + getName() + "\t地址：" + getAddress() + "\t电话号码：" + getTel());
	}

}
