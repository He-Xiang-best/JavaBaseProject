package ex04;
/**
 * 
 * @content:��ΪStudent��İ����Ա��Լ�ʵ�ֲο�
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��7������1:06:54
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��7������1:06:54
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Teacher extends People {
	public int workTime;
	/*
     * ͨ�����캯����ʼ����Ա��������Ϊ����Ϣ¼��ʱ��Ĭ����Ϣ
     */
    public Teacher() {
    	workTime = 0;
    }
    /*
     * �Զ�����Ϣ��
     */
    public Teacher(String name ,String id,int age,int workTime) {
  	    super(name, id, age);
    	setWorkTime(workTime);
    }
    /**
     * 
     * @content��ͨ��Getter��Setter�������ò���ȡ��װ�õ����Ա���
     * @return
     */
	public int getWorkTime() {
		return workTime;
	}
	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
}
