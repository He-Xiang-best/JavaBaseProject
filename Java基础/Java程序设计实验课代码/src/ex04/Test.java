package ex04;
/**
 * 
 * @content:对实验4第1题的所有项目的测试
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月7日下午12:44:54
 * @第一次修改的时间：
 * @time:2020年5月7日下午12:44:54
 * @修改原因：课堂测验，修改内容：
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("Part1——实验4第1题第1小问：");
		//完成并理解书中71页的J_Teacher.java例题
		J_Teacher teacher1 = new J_Teacher();
		teacher1.mb_printInfo();
		//理解隐式类型转换和显式类型转换的区别:
		/*
		 隐式类型转换:
		J_Employee employee = teacher1;
		 强制类型转换:
		System.out.println(((J_Employee) teacher1).m_workYear);
		 显示类型转换:
		J_Teacher teacher2 = (J_Teacher) employee;
		*/
		System.out.println("==================================================================");
		System.out.println("Part2——实验4第1题第2小问：\nStudent：");
		//可以在构造函数中设置打印，这里为了直观感受，就直接打印出来两组：一组没设置信息，一组设置了信息
		printS(new Student());
		printS(new Student("何翔","04191315",19,17));		
		System.out.println("Teacher：");
        printT(new Teacher());
        printT(new Teacher("吉珠教授","2004",50,30));
	}
	/*
	 * 分别打印类的信息（还可以用多态来实现信息的打印）
	 */
	public static void printS(Student student) {
		System.out.println("姓名：" + student.getName() + " , 学号为："+student.getId()+" , 今年"+
				student.getAge()+"岁"+" , 学习时长为："+student.getStudyTime()+"年");
	}
    public static void printT(Teacher teacher) {
    	System.out.println("授课教师："+teacher.getName()+" , 教职工号："+teacher.getId()+" , 年纪："+
        		teacher.getAge()+"岁"+" , 教学时长："+teacher.getWorkTime()+"年");
    }
}
