package ch03;

public class _15MyRect extends _15MyShape{
	private String rectName;
	_15MyRect(String name){
	rectName=name;
	}
	public void draw()
	{
		System.out.println ("��һ������");
	}
	public String getRectName()
	{
		return rectName;
	}

}
