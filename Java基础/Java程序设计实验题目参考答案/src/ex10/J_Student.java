package ex10;

// ////////////////////////////////////////////////////////
// 
// J_Student.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ѧ�����̡�
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
    } // J_Student���췽������

    public void mb_output( )
    {
        System.out.println("����: " + name);
        System.out.println("����: " + age);
        System.out.println("c�ɼ�: " + cScore);
        System.out.println("java�ɼ�: " + javaScore);
    } // ����mb_output����
    
    public String toString( )
    {
        return "����:"+ this.name+",����: " + age
        		+"c�ɼ�"+cScore+"java�ɼ�"+javaScore;
    }
} // ��J_Student����
