package ex3;
/**
 * ��ַ����
 * ���������ַ��Ϣ
 * @author ������
 * 2016.3.20
 *  
 */
public class AddressBook {

	private String name;//����
	private String address;//��ַ
	private String tel;//�绰
	
	/**
	 * get����
	 * @return ����������Ϣ
	 */
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get����
	 * @return ���ص�ַ��Ϣ
	 */
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * get����
	 * @return ���ص绰��Ϣ
	 */
	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

    /**
     * �ڿ���̨�������ַ������Ϣ
     */
	public void getInfo(){
		System.out.println("name : " + name);
		System.out.println("address : " + address);
		System.out.println("phone : " + tel);
	}
	
}