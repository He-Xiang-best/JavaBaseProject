package ex3;
/**
 * ������
 * �������ɵ�ַ��AddressBook���󣬲�������ط���
 * @author ������
 * 2016.3.20
 *  
 */
public class TestAddressBook {

	public static void main(String[] args) {
		//�½�����zhangsan_addr
		AddressBook zhangsan_addr = new AddressBook();
		//Ϊ����zhangsan_addr���ö�Ӧ��ֵ
		zhangsan_addr.setName("����Zhangsan");
		zhangsan_addr.setAddress("China");
		zhangsan_addr.setTel("865-3689843");
		zhangsan_addr.getInfo();
		//�޸Ķ���zhangsan_addr�ĵ绰������Ϣ
		zhangsan_addr.setTel("896-5815138");
		System.out.println(zhangsan_addr.getTel());
	}

}
