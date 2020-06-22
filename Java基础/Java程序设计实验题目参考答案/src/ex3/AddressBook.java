package ex3;
/**
 * 地址簿类
 * 用来保存地址信息
 * @author 郭晓燕
 * 2016.3.20
 *  
 */
public class AddressBook {

	private String name;//姓名
	private String address;//地址
	private String tel;//电话
	
	/**
	 * get方法
	 * @return 返回姓名信息
	 */
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get方法
	 * @return 返回地址信息
	 */
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * get方法
	 * @return 返回电话信息
	 */
	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

    /**
     * 在控制台上输出地址基本信息
     */
	public void getInfo(){
		System.out.println("name : " + name);
		System.out.println("address : " + address);
		System.out.println("phone : " + tel);
	}
	
}