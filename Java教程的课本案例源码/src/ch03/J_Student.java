package ch03;

public class J_Student
{
    public int m_id; // 学号
    public int m_age; // 年龄

    public J_Student( ){
        mb_setData(2008010400, 19);
    } // J_Student构造方法结束

    public J_Student( int id, int age ){
        mb_setData(id, age);
    } // J_Student构造方法结束

    public void mb_setData( int id, int age ){
        m_id = id;
        m_age = age;
    } // 方法mb_setData结束

    public void mb_setData( int id ){
        m_id = id;
    } // 方法mb_setData结束

    public static void main(String args[ ]){
        J_Student jack = new J_Student( );
        jack.mb_setData(2008010408);
        J_Student lisa = new J_Student(2008010428, 18);
        //lisa.mb_setData();
        System.out.print("Jack的学号是" + jack.m_id);
        System.out.println("，年龄是" + jack.m_age);
        System.out.print("Lisa的学号是" + lisa.m_id);
        System.out.println("，年龄是" + lisa.m_age);
    } // 方法main结束
} // 类J_Student结束
