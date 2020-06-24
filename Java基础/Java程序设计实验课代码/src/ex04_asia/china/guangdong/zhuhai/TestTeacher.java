package ex04_asia.china.guangdong.zhuhai;

import ex04_asia.china.guangdong.Counselor;
import ex04_asia.china.guangdong.Teacher;
/**
 * 
 * @content:生成测试类TestTeacher, 类包为asia.china.guangdong.zhuhai;
 *          在main主方法中创建Teacher类的对象jilinTeacher_zhangsan;
 *          初始化姓名、年龄，工作年限和职称，并测试修改职称信息并显示。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月7日下午1:26:34
 * @第一次修改的时间：
 * @time:2020年5月13日上午10:52:34
 * @修改原因：课堂测验，修改内容：在程序中增加一个辅导员类（Counsellor）继承Employee
 */
public class TestTeacher {

	public static void main(String[] args) {
		//初始化姓名、年龄，工作年限和职称:
		Teacher nobody = new Teacher();
		System.out.println("初始信息：");
		print(nobody);
		System.out.println("===============================================================");
		//创建Teacher类的对象jilinTeacher_zhangsan
		Teacher jilinTeacher_zhangsan = new Teacher("张三", 50, 30, "教授");
		System.out.println("测试修改后的信息：");
		print(jilinTeacher_zhangsan);
		System.out.println("===============================================================");
		//创建Counselor类的对象counselor
		Counselor counselor = new Counselor("胡丹", 30, "吉林大学珠海学院 ","研究生");
		System.out.println("课堂测验内容：");
		System.out.println("19级软件工程专业辅导员信息：\n姓名："+counselor.getName()+" , 年纪："+counselor.getAge()+
				"岁 , 所在院校："+counselor.getCollege()+" , 学历："+counselor.getLevel());
		
	}
       //测试修改职称信息并显示:
	public static void print(Teacher teacher) {
		System.out.println("授课教师：" + teacher.getName() + " , 年纪：" + teacher.getAge() + 
		"岁 , 教学时长：" + teacher.getWorkYear() + "年 , 工作职称：" + teacher.getJobTitle());
	}
}
