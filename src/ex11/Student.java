package ex11;

public class Student {
     private String name;
     private int age;
     private double javaScore;
     private double cScore;
     public Student() {
    	 name = "δ֪����";
    	 age = 18;
    	 javaScore = 0;
    	 cScore = 0;
     }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}
	public double getcScore() {
		return cScore;
	}
	public void setcScore(double cScore) {
		this.cScore = cScore;
	}
}
