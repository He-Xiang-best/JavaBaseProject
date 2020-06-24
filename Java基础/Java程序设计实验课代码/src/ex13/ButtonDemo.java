package ex13;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 
 * @content:设计一个界面，第一行3个按钮，第二行中间一个文本框，第三行含有两个按钮，
 * 一个按钮显示“问好”字样，另一个按钮显示“再见”字样。当点击“问好”按钮时，
 * 第二行文本框中显示出“你好！***”字样。点击“再见” 按钮时，文本框出现“再见，***”字样。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月18日下午4:27:42
 * @第一次修改的时间：
 * @time:2020年6月18日下午4:27:42
 * @修改原因：课堂测验，修改内容：
 */
public class ButtonDemo extends JFrame {

	/**
	 * Propose:
	 */
	private static final long serialVersionUID = 1L;
    private JButton jb1,jb2,jb3,jb4,jb5;
    private JTextField jt;
    JPanel jp1,jp2,jp3;
    
    public ButtonDemo(){
    	jb1 = new JButton("H");
    	jb2 = new JButton("烊");
    	jb3 = new JButton("X");
    	jb4 = new JButton("问好");
    	jb5 = new JButton("再见");
    	jt = new JTextField(20);
    	Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
        jp1 = new JPanel();
    	jp1.setLayout(new FlowLayout());
    	jp2 = new JPanel();
    	jp2.setLayout(new FlowLayout());
    	jp3 = new JPanel();
    	jp3.setLayout(new FlowLayout());
    	jp1.add(jb1);jp1.add(jb2);jp1.add(jb3);
    	jp2.add(jt);jp3.add(jb4);jp3.add(jb5);
    	jb4.addActionListener(e->{jt.setText("你好！何翔！");});
    	jb5.addActionListener(e->{jt.setText("再见，何翔！");}); 
    	jt.setEditable(false);
    	cp.add(jp1);cp.add(jp2);cp.add(jp3);	
    	setSize(250,200);
		setResizable(false);
		setLocationRelativeTo(getOwner());
		setVisible(true);
    }
    public static void main(String[] args) {
		new ButtonDemo().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
