package asia.china.guangdong.zhuhai;
import asia.china.guangdong.Teacher;
/**
 * 生成测试类TestTeacher, 类包为asia.china.guangdong.zhuhai。
 * 测试Teacher类  
 * @author 郭晓燕
 * @since JDK1.6
 * @version 1.0
 * @since 2017.3.30
 */
public class TestTeacher {
	public static void main(String[] args)
	{
		Teacher jilinTeacher_zhangsan=new Teacher(10,"讲师","张三",38);
		jilinTeacher_zhangsan.setJobTitle("教授");
		System.out.println("职称是："+jilinTeacher_zhangsan.getJobTitle());
	}

}
