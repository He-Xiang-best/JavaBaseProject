// ////////////////////////////////////////////////////////
// 
// J_Enum.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     枚举例程。
// ////////////////////////////////////////////////////////
package ch05;

enum E_SEASON1
{
    春季, 夏季, 秋季, 冬季 
} // 枚举E_SEASON结束

public class J_Enum
{
	
    public static void main(String args[ ])
    {
        E_SEASON1 [ ] sa = E_SEASON1.values( );
        for ( E_SEASON1 sea:sa )
        {
            switch(sea)
            {
            case 春季:
                System.out.println("春季花满天");
                break;
            case 夏季:
                System.out.println("夏季热无边");
                break;
            case 秋季:
                System.out.println("秋季果累累");
                break;
            case 冬季:
                System.out.println("冬季雪皑皑");
                break;                
            } // switch结构结束
        } // for循环结束
    } // 方法main结束
} // 类J_Enum结束
