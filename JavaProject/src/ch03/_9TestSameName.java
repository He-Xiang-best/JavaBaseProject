package ch03;

public class _9TestSameName extends _9FatherName{

	private String name="little David";
	public void showName()
	{
		String name="Davy";
		System.out.println("方法中的name="+name);
		System.out.println("子类成员变量name="+this.name);
		System.out.println("父类成员变量name="+super.name);
	}
	public static void main(String[] args) {
		_9TestSameName tsn=new _9TestSameName();
		tsn.showName();

	}
}
