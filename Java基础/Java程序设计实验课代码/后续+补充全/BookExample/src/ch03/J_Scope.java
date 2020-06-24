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
    // 这里省略类体的其他部分
} // 类J_Time结束

public class J_Scope extends J_Time1
{
    public int data = 2;

    public void mb_method( )
    {
        int data = 1;
        System.out.println("data=" + data);
        System.out.println("this.data=" + this.data);
        System.out.println("super.data=" + super.data);
    } // 方法mb_method结束

    public static void main(String args[ ])
    {
        J_Scope a = new J_Scope( );
        a.mb_method(  );
    } // 方法main结束
} // 类J_Scope结束
