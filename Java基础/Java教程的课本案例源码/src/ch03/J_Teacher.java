package ch03;

class J_Employee
{
   int m_workYear; // ����������

    public J_Employee( )
    {
        m_workYear = 1;
    } // J_Employee���췽������
    
    public void mb_printInfo()
    {
    	System.out.println("��ְ���Ĺ�������Ϊ"+m_workYear);
    }//����  mb_printInfo���� 
} // ��J_Employee����

public class J_Teacher extends J_Employee
{
    public int m_classHour; // �ڿεĿ�ʱ

    public J_Teacher( )
    {
        m_classHour = 96;
    } // J_Teacher���췽������

    public void mb_printInfo( )
    {
        System.out.println("�ý�ʦ�Ĺ�������Ϊ" + m_workYear);
        System.out.println("�ý�ʦ�ڿεĿ�ʱΪ" + m_classHour);
    } // ����mb_printInfo����

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
    } // ����main����
} // ��J_Teacher����
