package ex2;
/**
* ʵ��ڶ���
* �жϳɼ��ȼ���С����
*@author ������
*@version 2.0
*@since J2SE1.7
*2017.2.29
*/
public class GradeIdentify {
	/**
	 * ��������ķ�����Ӧ�����Ӧ�ķ����ȼ�
	 * @param grade ����Ϊ����0����
	 * @return ��Ӧ�ķ����ȼ�
	 * �ֱ�Ϊ�š������С����Ͳ�����
	 */
	String identiGrade(int grade){
		String result=" ";
		//�ɼ�Ҫ������0-100�ķ�Χ�ڣ�������Χ�����ڲ��Ϸ��ķ���
	
	if ((grade<=100)&&(grade>0)){	
		if (grade>=90)
			result="��";
		else{
			if (grade>=80)
				result="��";
			else{
				if (grade>=70)
				  result="��";
				else{
					if (grade>=60)
						result="����";
					else
						result="������";
				}//for else >=60			
			}//for else >=70					
		  }//for else >=80
	}
	else  result="���Ϸ��ĳɼ��ȼ�";
	return result;
	}

	public static void main(String[] args) {
		//int grade=-34;//���Խ���ĳɴӼ��������������
		int grade=InputPara.inputIntNumber();
		String result="";
		GradeIdentify iden=new GradeIdentify();//�½�һ��GradeIdentity����
		result=iden.identiGrade(grade);//���÷����жϷ����ȼ�
		System.out.print(result);//������
	}
}
