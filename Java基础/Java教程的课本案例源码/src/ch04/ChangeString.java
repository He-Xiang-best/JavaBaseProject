package ch04;

public class ChangeString {
	public static void main(String[] args) {
		String str=new String("   This IS a String    ");
		System.out.println("str="+str);
		System.out.println("str.trim()="+str.trim());
		System.out.println("str.replace('S','Z')="+str.replace('S','Z'));
		System.out.println("str.toLowerCase()="+str.toLowerCase());
		System.out.println("str.toUpperCase()="+str.toUpperCase());
		System.out.print("str="+str);
		
	}
}
