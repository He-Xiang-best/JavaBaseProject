package ex04;
/**
 * 
 * @content:����һ��Student���Teacher�������еĸ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��7������12:52:41
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��7������12:52:41
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class People {
     private String name;
     private String id;
     private int age;
     /*
      * ͨ�����캯����ʼ����Ա��������Ϊ����Ϣ¼��ʱ��Ĭ����Ϣ
      */
     public People(){
    	 name = "Nobody";
    	 id = "2020";
    	 age = 18;   			 
     }
     /*
      * �Զ�����Ϣ��
      */
     public People(String name,String id,int age) {
    	 this();
    	 setName(name);
    	 setId(id);
    	 setAge(age);
     }
     /**
      * 
      * @content��ͨ��Getter��Setter�������ò���ȡ��װ�õ����Ա���
      * @return
      */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
