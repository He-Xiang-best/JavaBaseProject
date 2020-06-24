package ch02;

public class J_Switch {
		/**
		 * @param args
		 */
		private int javaScore;
		public J_Switch(int myjavaScore)
		{
			javaScore=myjavaScore;
		}
		public void transferChengji()
		{
			if(javaScore>=90)
			{
				System.out.println("优");
			}
			else if(javaScore>=80)
			{
				System.out.println("良");
			}
			else if(javaScore>=70)
			{
				System.out.println("中");
			}
			else if(javaScore>=60)
			{
				System.out.println("及格");
			}
			else
			{
				System.out.println("不及格");
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			J_Switch studentcj=new J_Switch(76);
			studentcj.transferChengji();
		}

	

}
