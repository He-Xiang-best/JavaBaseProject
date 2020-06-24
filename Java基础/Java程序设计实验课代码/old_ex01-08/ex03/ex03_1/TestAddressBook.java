package ex03_1;

import java.util.Scanner;
/**
 * @content:对AddressBook类进行测试
 * @author:04191315何翔
 * @time:2020年4月28日下午11:25:10
 */
public class TestAddressBook {

	public static void main(String[] args) {
		/**
		 在该类中的main主方法中创建AddressBook对象:zhangsan_addr;(通过默认的构造方法创建对象)
	         通过张三地址簿对象（zhangsan_addr）分别设置他的姓名，地址和电话(通过构造函数设置)
		 */
		AddressBook zhangsan_addr = new AddressBook();
		//通过getAllInfo() 方法来显示设置结果
		zhangsan_addr.getAllinfo();
		//通过setTel()方法来修改电话号码
		System.out.println("\n电话号码需修改为短号，填入前五位即可：");
		Scanner input = new Scanner(System.in);
		long newtel = input.nextLong();
		zhangsan_addr.setTel(newtel);
		//使用getTel()方法显示修改后的结果
		System.out.println("新号码为：" + zhangsan_addr.getTel());
		input.close();
	}
}
