package ex04;
/**
 * 
 * @content:���Դ���һ��Student�࣬������ļ̳��ص㣬���ʸ����Ƿ���Լ̳�J_Employee��
 *          ������ܣ��ɷ�����һ��Student���Teacher�������еĸ��ࣿ���ʵ��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��7������11:54:44
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��7������11:54:44
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */

/*
 *����ѧ����˵�������й�Ա����������˲��ʺϼ̳�J_Employee
 *����ʦ��ѧ�������ˣ��������֡����䡢ѧ�������ŵȹ�ͬ������
 *��˿�������һ�����ǹ�ͬ�ĸ��ࡪ��People������̳й�ͬ������
 */

public class Student extends People {
      public int studyTime;
      /*
       * ͨ�����캯����ʼ����Ա��������Ϊ����Ϣ¼��ʱ��Ĭ����Ϣ
       */
      public Student() {
    		studyTime = 0;
      }
      /*
       * �Զ�����Ϣ��
       */
      public Student(String name, String id,int age,int studyTime) {
    	  super(name, id, age);
    	  setStudyTime(studyTime);
      }
      /**
       * 
       * @content��ͨ��Getter��Setter�������ò���ȡ��װ�õ����Ա���
       * @return
       */
	public int getStudyTime() {
		return studyTime;
	}
	public void setStudyTime(int studyTime) {
		this.studyTime = studyTime;
	}
}
