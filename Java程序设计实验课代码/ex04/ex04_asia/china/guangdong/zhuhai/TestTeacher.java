package ex04_asia.china.guangdong.zhuhai;

import ex04_asia.china.guangdong.Teacher;
/**
 * 
 * @content:���ɲ�����TestTeacher, ���Ϊasia.china.guangdong.zhuhai;
 *          ��main�������д���Teacher��Ķ���jilinTeacher_zhangsan;
 *          ��ʼ�����������䣬�������޺�ְ�ƣ��������޸�ְ����Ϣ����ʾ��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��7������1:26:34
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��7������1:26:34
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class TestTeacher {

	public static void main(String[] args) {
		//��ʼ�����������䣬�������޺�ְ��
		Teacher nobody = new Teacher();
		System.out.println("��ʼ��Ϣ��");
		print(nobody);
		System.out.println("===============================================================");
		//����Teacher��Ķ���jilinTeacher_zhangsan
		Teacher jilinTeacher_zhangsan = new Teacher("����", 50, 30, "����");
		System.out.println("�����޸ĺ����Ϣ��");
		print(jilinTeacher_zhangsan);
	}
       //�����޸�ְ����Ϣ����ʾ:
	public static void print(Teacher teacher) {
		System.out.println("�ڿν�ʦ��" + teacher.getName() + " , ��ͣ�" + teacher.getAge() + 
		"�� , ��ѧʱ����" + teacher.getWorkYear() + "�� , ����ְ�ƣ�" + teacher.getJobTitle());
	}
}
