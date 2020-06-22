package ex3;
/**
 * 测试类
 * 用来生成地址簿AddressBook对象，并调用相关方法
 * @author 郭晓燕
 * 2016.3.20
 *  
 */
public class TestAddressBook {

	public static void main(String[] args) {
		//新建对象zhangsan_addr
		AddressBook zhangsan_addr = new AddressBook();
		//为对象zhangsan_addr设置对应的值
		zhangsan_addr.setName("张三Zhangsan");
		zhangsan_addr.setAddress("China");
		zhangsan_addr.setTel("865-3689843");
		zhangsan_addr.getInfo();
		//修改对象zhangsan_addr的电话号码信息
		zhangsan_addr.setTel("896-5815138");
		System.out.println(zhangsan_addr.getTel());
	}

}
