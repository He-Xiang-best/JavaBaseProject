package ex11;

import java.io.Serializable;

public class Student implements Serializable{
	static final long serialVersionUID = 14041002L;
	String name;
	int GradeC;
	int GradeJava;
	int average;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGradeC() {
		return GradeC;
	}
	public void setGradeC(int gradeC) {
		GradeC = gradeC;
	}
	public int getGradeJava() {
		return GradeJava;
	}
	public void setGradeJava(int gradeJava) {
		GradeJava = gradeJava;
	}
	public void average(){
		average=(GradeJava+GradeC)/2;
	}
	public int getAverage(){
		return average;
	}
	public String toString(){
		return "ÐÕÃû: " + name+",C³É¼¨: " 
				+GradeC+",Java³É¼¨: " +GradeJava;
	}

}