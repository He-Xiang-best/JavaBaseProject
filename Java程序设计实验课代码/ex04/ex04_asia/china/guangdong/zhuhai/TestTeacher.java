package ex04_asia.china.guangdong.zhuhai;

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
 * @time:2020年5月7日下午1:26:34
 * @修改原因：课堂测验，修改内容：
 */
public class TestTeacher {

	public static void main(String[] args) {
		//初始化姓名、年龄，工作年限和职称
		Teacher nobody = new Teacher();
		System.out.println("初始信息：");
		print(nobody);
		System.out.println("===============================================================");
		//创建Teacher类的对象jilinTeacher_zhangsan
		Teacher jilinTeacher_zhangsan = new Teacher("张三", 50, 30, "教授");
		System.out.println("测试修改后的信息：");
		print(jilinTeacher_zhangsan);
	}
       //测试修改职称信息并显示:
	public static void print(Teacher teacher) {
		System.out.println("授课教师：" + teacher.getName() + " , 年纪：" + teacher.getAge() + 
		"岁 , 教学时长：" + teacher.getWorkYear() + "年 , 工作职称：" + teacher.getJobTitle());
	}
}
