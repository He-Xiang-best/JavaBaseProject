package ch08;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class J_Tree extends JFrame{
	DefaultMutableTreeNode rootNode=createNode();
	JTree tree = new JTree(rootNode);
	JTextField textField = new JTextField(10);
	JScrollPane scrollPane=new JScrollPane();
	JButton button1 = new JButton("����");
	JButton button2 = new JButton("ɾ��");
	JPanel jp=new JPanel();	
	public J_Tree() 
	{	setTitle("���ṹ����");
		getContentPane().setLayout(new BorderLayout());
		jp.setLayout(new FlowLayout());
		jp.add(textField);
		jp.add(button1);
		jp.add(button2);
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		getContentPane().add(jp,BorderLayout.SOUTH);
		scrollPane.getViewport().add(tree);	
		tree.addTreeSelectionListener(new TreeSelectionListener()
		{public void valueChanged(TreeSelectionEvent e)
			{//��ȡ��ǰ�ڵ��·��
    				TreePath selectionPath = e.getPath();
    				DefaultMutableTreeNode selectedNode;
    		selectedNode=(DefaultMutableTreeNode)
selectionPath.getLastPathComponent();//��ȡ��ǰ�ڵ�
    			textField.setText(selectedNode.toString());			
			}
		});		
		button1.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{	addNode();      }
		});	
		button2.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{	removeNode();}
		});
	}
	public static void main(String args[])
	{	J_Tree app=new J_Tree();
		app.setSize(300,300);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
DefaultMutableTreeNode createNode ()
	{	//�����ڵ�
	DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("�˶�");
    	DefaultMutableTreeNode balls = new DefaultMutableTreeNode("����");
 DefaultMutableTreeNode trackField = new DefaultMutableTreeNode("�ﾶ");
    	//����ֽڵ�
    	rootNode.add(balls);
    	rootNode.add(trackField);
    	balls.add(new DefaultMutableTreeNode ("����"));
    	balls.add(new DefaultMutableTreeNode ("����"));
    	trackField.add(new DefaultMutableTreeNode ("����100��"));
    	trackField.add(new DefaultMutableTreeNode ("��Զ"));	
    	return rootNode;
	}
    void removeNode()
    {TreePath selectedPath = tree.getSelectionPath();//��ȡ��ǰ�ڵ��·�� 
  	    if (selectedPath!=null)
  	    {   DefaultMutableTreeNode selectedNode;
  	   	    DefaultTreeModel treeModel;
selectedNode = (DefaultMutableTreeNode)
selectedPath.getLastPathComponent();//��ȡ��ǰ�ڵ�
  	        treeModel=(DefaultTreeModel)tree.getModel();
  	        treeModel.removeNodeFromParent(selectedNode); //ɾ���ڵ�
  	    }
    }
    void addNode()
    {   DefaultMutableTreeNode newNode;
  	    newNode = new DefaultMutableTreeNode(textField.getText());
   	  TreePath selectedPath = tree.getSelectionPath();//��ȡ��ǰ�ڵ��·��
  	    if (selectedPath!=null)
  	    {   DefaultMutableTreeNode selectedNode;
  	   	    DefaultTreeModel treeModel;
  	   	    selectedNode = (DefaultMutableTreeNode)
selectedPath.getLastPathComponent();  //��ȡ��ǰ�ڵ�
  	   	    treeModel=(DefaultTreeModel)tree.getModel();
  	   	   treeModel.insertNodeInto(newNode,selectedNode,
selectedNode.getChildCount());//���ӽڵ�  
  	    }
    }

}
