package ex08;
/**
 * 
 * @content:�½�һ��ѧ��Student�࣬���԰���ѧ�š���������ѧ��Ӣ��ͼ�������ſγ̳ɼ���ƽ���֡�
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������6:39:35
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��27������6:39:35
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Student {
       private String name;
       private String ID;
       private double averageScore;
       private float Computer,Math,English;
public Student() {
     //�ڹ��췽�����½�5λѧ���Ļ�����Ϣ��Ҫ�����ͨ�������������޸�ѧ����ѧ�š�ƽ����֮�����Ϣ��
	//����ʵ�����֮�£�һ��¼��ɼ����Ǽ������룬�˴��Ͳ�����Ĭ����Ϣ��
}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	public float getComputer() {
		return Computer;
	}
	public void setComputer(float computer) {
		Computer = computer;
	}
	public float getMath() {
		return Math;
	}
	public void setMath(float math) {
		Math = math;
	}
	public float getEnglish() {
		return English;
	}
	public void setEnglish(float english) {
		English = english;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public String toString() {		
		return ("ѧ��Ϊ��"+ID+"��"+name+"ͬѧ���ſ�Ŀ��ƽ���ɼ�Ϊ:"+(float)averageScore);
	}
}
