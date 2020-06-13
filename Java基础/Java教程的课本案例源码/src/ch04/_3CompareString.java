package ch04;

public class _3CompareString {
	public static void main(String[] args) {
		String str1 = "Hello, Java!";
		String str2 = "hello, java!";
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo("Hello everbody"));	
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		String s3="hello";
		String s4="hello";
		String s5=new String("Hello");
		String s6=new String ("hello");
	if(s6==s4)
	{
		System.out.println ("s6==s4 is true");
	}else
	{
		System.out.println ("s6==s4 is false");
	}
	if(s5.equals(s6))
	{
		System.out.println ("s5.equals(s6) is true");
	}else
	{
		System.out.println ("s5.equals(s6) is false");
	}
	}

}
