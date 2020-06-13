package ch08;

// ////////////////////////////////////////////////////////
// 
// J_DiagonalLayout.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     创建自定义的对角线布局管理器例程。
// ////////////////////////////////////////////////////////


import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;

public class J_DiagonalLayout implements LayoutManager
{
    public void addLayoutComponent(String name, Component comp)
    {
    } // 方法addLayoutComponent结束

    public void removeLayoutComponent(Component comp)
    {
    } // 方法removeLayoutComponent结束

    public Dimension preferredLayoutSize(Container parent)
    {
        Dimension d  = null;
        Insets    s  = parent.getInsets( ); // 容器四条边框的尺寸
        Dimension dp = new Dimension(s.left + s.right, s.top + s.bottom);
        Component c;
        int n = parent.getComponentCount( );

        for (int i=0; i<n; i++)
        { // 计算组件及容器边框宽度之和及高度之和
            c = parent.getComponent(i);
            if (c.isVisible( ))
            {
                d = c.getPreferredSize( );
                dp.width += d.width;
                dp.height+= d.height;
            } // if结构结束
        } // for循环结束
        return dp;
    } // 方法preferredLayoutSize结束

    public Dimension minimumLayoutSize(Container parent)
    {
        Dimension d  = null;
        Insets    s  = parent.getInsets( ); // 容器四条边框的尺寸
        Dimension dp = new Dimension(0, 0);
        Component c;
        int n = parent.getComponentCount( );
        for (int i =0; i<n; i++)
        { // 计算各个组件的最大宽度和最大高度
            c = parent.getComponent(i);
            if (c.isVisible( ))
            {
                d = c.getPreferredSize( );
                if (d.width> dp.width)
                    dp.width= d.width;
                if (d.height> dp.height)
                    dp.height= d.height;
            } // if结构结束
        } // for循环结束
        dp.width += (s.left + s.right);
        dp.height+= (s.top + s.bottom);
        return dp;
    } // 方法minimumLayoutSize结束

    public void layoutContainer(Container parent)
    { // 当第一次显示指定容器或该容器的大小发生变化时调用本方法
        int         i;
        int         n = parent.getComponentCount( );
        Component   c;
        Insets      s   = parent.getInsets( ); // 容器四条边框的尺寸
        Dimension   d;
        Dimension   dp  = parent.getSize( ); // 容器本身的尺寸
        Dimension   dr  = preferredLayoutSize(parent); // 容器的最佳尺寸
        Dimension   dc  = new Dimension(s.left, s.top); // 组件的当前位置
        Dimension dg
            = new Dimension(dp.width-dr.width, dp.height-dr.height);
        if (n>1)
        { // 计算组件之间的间隙
            dg.width  /= (n-1);
            dg.height /= (n-1);
        } // if结构结束
        
        for (i=0 ; i<n ; i++)
        {
            c = parent.getComponent(i);
            if (c.isVisible( ))
            {
                d = c.getPreferredSize( );
                c.setBounds(dc.width, dc.height, d.width, d.height);
                dc.width += (dg.width+d.width);
                dc.height+= (dg.height+d.height);
            } // if结构结束
        } // for循环结束
    } // 方法layoutContainer结束
} // 类J_DiagonalLayout结束
