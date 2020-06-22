package ex2;
/**
* 实验第二章
* 判断成绩等级的小程序
*@author 郭晓燕
*@version 2.0
*@since J2SE1.7
*2017.2.29
*/
public class GradeIdentify {
	/**
	 * 根据输入的分数相应输出对应的分数等级
	 * @param grade 参数为大于0整数
	 * @return 对应的分数等级
	 * 分别为优、良、中、及和不及格
	 */
	String identiGrade(int grade){
		String result=" ";
		//成绩要控制在0-100的范围内，超出范围的属于不合法的分数
	
	if ((grade<=100)&&(grade>0)){	
		if (grade>=90)
			result="优";
		else{
			if (grade>=80)
				result="良";
			else{
				if (grade>=70)
				  result="中";
				else{
					if (grade>=60)
						result="及格";
					else
						result="不及格";
				}//for else >=60			
			}//for else >=70					
		  }//for else >=80
	}
	else  result="不合法的成绩等级";
	return result;
	}

	public static void main(String[] args) {
		//int grade=-34;//可以将其改成从键盘中输入的数字
		int grade=InputPara.inputIntNumber();
		String result="";
		GradeIdentify iden=new GradeIdentify();//新建一个GradeIdentity对象
		result=iden.identiGrade(grade);//调用方法判断分数等级
		System.out.print(result);//输出结果
	}
}
