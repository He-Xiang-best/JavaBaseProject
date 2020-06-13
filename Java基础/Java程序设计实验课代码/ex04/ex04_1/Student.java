package ex04;
/**
 * 
 * @content:尝试创建一个Student类，根据类的继承特点，试问该类是否可以继承J_Employee？
 *          如果不能，可否设置一个Student类和Teacher类所共有的父类？编程实现
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月7日上午11:54:44
 * @第一次修改的时间：
 * @time:2020年5月7日上午11:54:44
 * @修改原因：课堂测验，修改内容：
 */

/*
 *对于学生来说，不具有雇员的特征，因此不适合继承J_Employee
 *但老师和学生都是人，具有名字、年龄、学（工）号等共同的特征
 *因此可以设置一个他们共同的父类——People，得意继承共同的属性
 */

public class Student extends People {
      public int studyTime;
      /*
       * 通过构造函数初始化成员变量，作为无信息录入时的默认信息
       */
      public Student() {
    		studyTime = 0;
      }
      /*
       * 自定义信息：
       */
      public Student(String name, String id,int age,int studyTime) {
    	  super(name, id, age);
    	  setStudyTime(studyTime);
      }
      /**
       * 
       * @content：通过Getter与Setter方法设置并获取封装好的属性变量
       * @return
       */
	public int getStudyTime() {
		return studyTime;
	}
	public void setStudyTime(int studyTime) {
		this.studyTime = studyTime;
	}
}
