package ch03;

class J_Time1
{
    public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int data = 3;
    // ����ʡ���������������
} // ��J_Time����

public class J_Scope extends J_Time1
{
    public int data = 2;

    public void mb_method( )
    {
        int data = 1;
        System.out.println("data=" + data);
        System.out.println("this.data=" + this.data);
        System.out.println("super.data=" + super.data);
    } // ����mb_method����

    public static void main(String args[ ])
    {
        J_Scope a = new J_Scope( );
        a.mb_method(  );
    } // ����main����
} // ��J_Scope����
