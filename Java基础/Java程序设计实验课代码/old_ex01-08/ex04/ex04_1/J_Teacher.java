package ex04;
/**
 * @content:��ɲ��������71ҳ��J_Teacher.java����
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��7������11:40:03
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��7������11:40:03
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class J_Teacher extends J_Employee {
	//����Teacher�Լ������ԡ�����ѧʱ��
	public int m_classHour;
    //ͨ�����캯����ʼ����Ա����
	public J_Teacher() {
		m_classHour = 96;
	}
	//ͨ����д����ķ�������չ����Ĺ��ܣ�
	public void mb_printInfo() {
		System.out.println("�ý�ʦ�Ĺ�������Ϊ��" + m_workYear);
		System.out.println("�ý�ʦ�ڿεĿ�ʱΪ��" + m_classHour);
	}
/**
 * 
 * @content��ͨ��Getter��Setter�������ò���ȡ��װ�õ����Ա���
 * @return
 */
	public int getM_classHour() {
		return m_classHour;
	}

	public void setM_classHour(int m_classHour) {
		this.m_classHour = m_classHour;
	}
	
}
