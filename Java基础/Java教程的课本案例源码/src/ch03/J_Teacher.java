package ch03;

class J_Employee
{
   int m_workYear; // 工作的年限

    public J_Employee( )
    {
        m_workYear = 1;
    } // J_Employee构造方法结束
    
    public void mb_printInfo()
    {
    	System.out.println("该职工的工作年限为"+m_workYear);
    }//方法  mb_printInfo结束 
} // 类J_Employee结束

public class J_Teacher extends J_Employee
{
    public int m_classHour; // 授课的课时

    public J_Teacher( )
    {
        m_classHour = 96;
    } // J_Teacher构造方法结束

    public void mb_printInfo( )
    {
        System.out.println("该教师的工作年限为" + m_workYear);
        System.out.println("该教师授课的课时为" + m_classHour);
    } // 方法mb_printInfo结束

    public static void main(String args[ ])
    {
    	J_Teacher jt=new J_Teacher();
    	J_Employee a=new J_Teacher();
    	a.mb_printInfo();
    	
    	/*J_Employee tom= new J_Employee();
    	tom.mb_printInfo();
    	tom = new J_Teacher( );
        tom.mb_printInfo( );
        */
    } // 方法main结束
} // 类J_Teacher结束
