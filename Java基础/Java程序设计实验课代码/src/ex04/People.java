package ex04;
/**
 * 
 * @content:设置一个Student类和Teacher类所共有的父类
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月7日下午12:52:41
 * @第一次修改的时间：
 * @time:2020年5月7日下午12:52:41
 * @修改原因：课堂测验，修改内容：
 */
public class People {
     private String name;
     private String id;
     private int age;
     /*
      * 通过构造函数初始化成员变量，作为无信息录入时的默认信息
      */
     public People(){
    	 name = "Nobody";
    	 id = "2020";
    	 age = 18;   			 
     }
     /*
      * 自定义信息：
      */
     public People(String name,String id,int age) {
    	 this();
    	 setName(name);
    	 setId(id);
    	 setAge(age);
     }
     /**
      * 
      * @content：通过Getter与Setter方法设置并获取封装好的属性变量
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
