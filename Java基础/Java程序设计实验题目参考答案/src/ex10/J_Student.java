package ex10;

// ////////////////////////////////////////////////////////
// 
// J_Student.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     学生例程。
// ////////////////////////////////////////////////////////


import java.io.Serializable;

public class J_Student implements Serializable
{
    static final long serialVersionUID = 123456L;
    String name;
    int age;
    int cScore;
    int javaScore;

    public J_Student( String name, int age, int c,int java )
    {
        this.name = name;
        this.age = age;
        cScore = c;
        javaScore=java;
    } // J_Student构造方法结束

    public void mb_output( )
    {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("c成绩: " + cScore);
        System.out.println("java成绩: " + javaScore);
    } // 方法mb_output结束
    
    public String toString( )
    {
        return "姓名:"+ this.name+",年龄: " + age
        		+"c成绩"+cScore+"java成绩"+javaScore;
    }
} // 类J_Student结束
