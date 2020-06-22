package ex12;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class TestFileDialog {
	public static void main(String args[]){
		new FileFrame();
	}

}

class FileFrame  extends Frame implements ActionListener{
	TextArea ta;
	Button open,quit;
	FileDialog fd;
	FileFrame(){
		super("获取显示文本文件");
		ta=new TextArea(10,45);
		open=new Button("打开");
		quit=new Button("关闭");
		open.addActionListener(this);
		quit.addActionListener(this);
		setLayout(new FlowLayout());
		add(ta);
		add(open);
		add(quit);
		show();
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand()=="打开"){
			fd=new FileDialog(this,"打开文件",FileDialog.LOAD);
			fd.setDirectory("d:");
			fd.show();
			try{
				File myfile=new File(fd.getDirectory(),fd.getFile());
				System.out.print(myfile);
				BufferedReader inB=new BufferedReader(new FileReader(myfile));
				String fileCountent="",ste="";
				while((ste=inB.readLine())!=null){
					fileCountent=ste+fileCountent+"\n";
					ta.append(fileCountent+"\n");
				}
					
			}
			catch(Exception ie){
				System.out.print(ie.toString());
				
			}
		}
		if(e.getActionCommand()=="关闭"){
			dispose();
			System.exit(0);
		}
	}
	
}

