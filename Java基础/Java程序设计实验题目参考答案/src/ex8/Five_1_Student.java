package ex8;
/**
 * 一个学生类
 * @author 郭晓燕
 *
 */
public class Five_1_Student {
	int id;
	String name;
	int grade1;
	int grade2;
	int grade3;
	int average;
	public Five_1_Student(){
		
	}
	
	public Five_1_Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade1() {
		return grade1;
	}
	public void setGrade1(int grade1) {
		if((grade1<0)||(grade1>=100)) grade1=0;
		this.grade1 = grade1;
	}
	public int getGrade2() {
		return grade2;
	}
	public void setGrade2(int grade2) {
		if(grade2<0) grade2=0;
		this.grade2 = grade2;
	}
	public int getGrade3() {
		return grade3;
	}
	public void setGrade3(int grade3) {
		if(grade3<0) grade3=0;
		this.grade3 = grade3;
	}

	public int getAverage() {
		this.average=(grade1+grade2+grade3)/3;
		return average;
	}

	
	
	
}
