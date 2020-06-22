package ex9;

 class MyExep extends Exception
{
	 MyExep(String msg){
		 
		 super(msg);               
	 }
}
public class MyEx_Main 
	{
		 private int x;
		 void setX(int x)
	 {
			 this.x=x;           
	 }
	 void f1() throws MyExep
	 {
	  if(x==13)
		  throw new MyExep("I don't like 13!");
	     
	  else if(x==4)
		  throw new MyExep("I don¡¯t like 4!");                        
	  else
	      System .out.println(100/x);
	 }
	public static void main(String args[ ])
	{
		 MyEx_Main a=new MyEx_Main();
		 try 
		 {
		  a.setX(5);
		  a.setX(13);
		  //a.setX(4);
		  //a.setX(0);
		  a.f1();
		}
		 catch(MyExep e)
		 {
		  System .out.println("get message:"+e.getMessage());
		 }
	}
}

