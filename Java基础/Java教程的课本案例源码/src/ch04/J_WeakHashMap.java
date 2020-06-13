// ////////////////////////////////////////////////////////
// 
// J_WeakHashMap.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     类WeakHashMap会自动去掉一些“不常用”元素(关键字及对应的值)的例程。
// ////////////////////////////////////////////////////////
package ch04;

import java.util.WeakHashMap;

public class J_WeakHashMap
{
    public static void main(String args[ ]) throws Exception
    {
        // 创建WeakHashMap实例对象
        int s=800; // 将往WeakHashMap实例对象中添加的元素的个数
        WeakHashMap<String, String> ht
            = new WeakHashMap<String, String>(s*4/3, 0.75f);

        // 给WeakHashMap实例对象添加元素(关键字及其值)
        int i;
        for (i=0; i<s; i++)
            ht.put(("key"+i), ("value"+i));
        System.out.println("在刚添加完数据时，弱哈希表元素个数是" + ht.size( ));

        // 输出已经不在WeakHashMap实例对象中的元素；否则等待弱哈希表删除元素
        for (i=0; i<s; )
        {
            if (!ht.containsKey("key"+i))
                System.out.print("key" + i + "; ");
            if (ht.size( )!=s)
                i++;
        } // for循环结束
        System.out.println("");
        System.out.println("一段时间之后，弱哈希表元素个数是" + ht.size( ));
    } // 方法main结束
} // 类J_WeakHashMap结束
