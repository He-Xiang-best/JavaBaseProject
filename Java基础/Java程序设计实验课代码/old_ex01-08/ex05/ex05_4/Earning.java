package ex05_4;
/**
 * 
 * @content:��̬�ڹ���ϵͳ�е�Ӧ�ã����һ�����ݹ�Ա��������abstract�����Ͷ�̬����ɹ��ʵ�����ĳ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��13������12:23:44
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��13������12:23:44
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Earning {
    //�ڳ���������earnings()Ϊ���󷽷��������Ҷ���ÿ�����඼�ṩǡ����earnings()��ʵ�ַ���
	//�����й�Ա���Ͷ�ʹ��earnings()��������ÿ�������Ĺ��ʰ��������Ĺ�Ա�����
	//���й�Ա�඼�Ǵӳ���Earnings()�ɳ����ġ�
	//Ϊ�˼����Ա�Ĺ��ʣ��������ʹ�ù�Ա����ĳ�������������earnings()����

	public static void main(String[] args) {
		/*
		 * Ϊ�˼����Ա�Ĺ��ʣ��������ʹ�ù�Ա����ĳ������� ������earnings()����
		 * һ��ʵ�ʵĹ���ϵͳSalary�У�����Employee��������ÿ���ͨ��һ��Employee����������ʵ��
		 * ��������ʹ�������ÿ��Ԫ�أ�Employee���ã�����ÿ�������earnings()�������㹤�ʵ�
		 */
		System.out.println("����һ��ӡ��");
		//ͨ�����캯������earning����ֱ�Ӵ�ӡ��
		Employee[] employee = { new Boss(), new CommissionWorker(), new PieceWorker(), new HourWorker() };
		System.out.println("\n��������ӡ��");
		//forѭ������earning������ӡ��
		for (int i = 0; i < employee.length; i++) {
			employee[i].earning();
		}
		System.out.println("\n��������ӡ��");
		//���׵�for��䣺
		for (Employee employee2 : employee) {
			employee2.earning();
		}
	}
}
