package ch03;

public class _9TestSameName extends _9FatherName{

	private String name="little David";
	public void showName()
	{
		String name="Davy";
		System.out.println("�����е�name="+name);
		System.out.println("�����Ա����name="+this.name);
		System.out.println("�����Ա����name="+super.name);
	}
	public static void main(String[] args) {
		_9TestSameName tsn=new _9TestSameName();
		tsn.showName();

	}
}
