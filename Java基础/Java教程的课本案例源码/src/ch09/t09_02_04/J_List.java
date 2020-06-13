package ch09.t09_02_04;

// ////////////////////////////////////////////////////////
// 
// J_List.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     小应用程序例程——图像显示。
// ////////////////////////////////////////////////////////


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JList;

public class J_List extends JApplet
{
    private String    m_items[ ] = { "snow.gif", "flag.gif" , "rain.gif"};
    private JList     m_list    = new JList( m_items );
    private JLabel    m_label   = new JLabel( );
    private Icon      m_icons[ ] = new ImageIcon[3];

    public void init( )
    {
        Image theImage[ ] = {getImage(getCodeBase( ), m_items[0]), 
                            getImage(getCodeBase( ), m_items[1]),
                            getImage(getCodeBase( ), m_items[2]) };
        for (int i=0; i< 3; i++)
            m_icons[i] = new ImageIcon(theImage[i]);
        Container c = getContentPane( );
        c.add( m_list, BorderLayout.WEST );
        m_list.setSelectedIndex(0);
        m_list.addListSelectionListener(new ListSelectionListener( )
            {
                public void valueChanged(ListSelectionEvent e )
                {
                    int s = m_list.getAnchorSelectionIndex( );
                    m_label.setIcon( m_icons[ s ] );
                } // 方法valueChanged结束
            } // 实现接口ListSelectionListener的内部类结束
        ); // addListSelectionListener方法调用结束
        c.add( m_label, BorderLayout.EAST );
        m_label.setIcon( m_icons[ 0 ] );
    } // 方法init结束
} // 类J_List结束
