package asia.china.guangdong.zhuhai;
import asia.china.guangdong.Teacher;
/**
 * ���ɲ�����TestTeacher, ���Ϊasia.china.guangdong.zhuhai��
 * ����Teacher��  
 * @author ������
 * @since JDK1.6
 * @version 1.0
 * @since 2017.3.30
 */
public class TestTeacher {
	public static void main(String[] args)
	{
		Teacher jilinTeacher_zhangsan=new Teacher(10,"��ʦ","����",38);
		jilinTeacher_zhangsan.setJobTitle("����");
		System.out.println("ְ���ǣ�"+jilinTeacher_zhangsan.getJobTitle());
	}

}
