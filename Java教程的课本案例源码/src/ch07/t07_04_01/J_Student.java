package ch07.t07_04_01;

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
    String m_name;
    int m_id;
    int m_height;

    public J_Student( String name, int id, int h )
    {
        m_name = name;
        m_id = id;
        m_height = h;
    } // J_Student���췽������

    public void mb_output( )
    {
        System.out.println("����: " + m_name);
        System.out.println("ѧ��: " + m_id);
        System.out.println("���: " + m_height);
    } // ����mb_output����
    
    public String toString( )
    {
        return "����: :::" + m_name+",ѧ��: " + m_id;
    }
} // ��J_Student����
