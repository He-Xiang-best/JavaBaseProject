/*
 * Created by JFormDesigner on Tue Nov 03 21:30:46 CST 2020
 */

package view.studentView;

import classType.infoType.Student;
import sqlContact.StudentContact;
import util.StringUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;

/*
 * @author:何翔
 * @date:2020/11/20 10:02
 * @description:学生信息管理窗口
 /*

 */

public class StudentManageWindow extends JFrame {
    public StudentManageWindow() {
        initComponents();
        setTable(new Student());
    }
    public void showStudentManageWindow(){
        this.setVisible(true);
    }

    private void resetActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 10:03
         * @description：重置文本栏信息
         */
        classIDTextField4.setText("");
        stu_idTextField.setText("");
        stu_nameTextField.setText("");
    }
    private void setTable(Student student){
        /*
         * @author: 何翔
         * @param: [student]
         * @return: void
         * @date: 2020/11/20 10:03
         * @description：获取学生信息填充表格
         */
        DefaultTableModel dft = (DefaultTableModel) studentListTable.getModel();
        dft.setRowCount(0);
        StudentContact classContact = new StudentContact();
        List<Student> stu_List = classContact.getStudentList(student);
        for (Student st : stu_List) {
            Vector v = new Vector();
            v.add(st.getClass_id());
            v.add(st.getStu_id());
            v.add(st.getName());

            dft.addRow(v);
        }
        classContact.CloseCon();
    }

    private void studentListTableMouseClicked(MouseEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 10:03
         * @description：通过点击事件填充文本栏
         */
        DefaultTableModel dft = (DefaultTableModel) studentListTable.getModel();
        classIDTextField4.setText(dft.getValueAt(studentListTable.getSelectedRow(), 0).toString());
        stu_idTextField.setText(dft.getValueAt(studentListTable.getSelectedRow(), 1).toString());
        stu_nameTextField.setText(dft.getValueAt(studentListTable.getSelectedRow(), 2).toString());

    }

    private void editActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 10:04
         * @description：编辑学生信息
         */
        StudentContact studentContact = new StudentContact();
        int index = studentListTable.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(this, "请选中要修改的数据!");
            return;
        }
        DefaultTableModel dft = (DefaultTableModel) studentListTable.getModel();
        String classID = dft.getValueAt(studentListTable.getSelectedRow(), 0).toString();
        String stu_id = dft.getValueAt(studentListTable.getSelectedRow(), 1).toString();
        String stuName = dft.getValueAt(studentListTable.getSelectedRow(), 2).toString();
        String editClassID = classIDTextField4.getText().toString();
        String editName = stu_nameTextField.getText().toString();
        if(StringUtil.isEmpty(editName)||StringUtil.isEmpty(editClassID)){
            JOptionPane.showMessageDialog(this, "请填写要修改的内容!");
            return;
        }
        if(stuName.equals(editName) && classID.equals(editClassID)){
            JOptionPane.showMessageDialog(this, "您还没有做任何修改!");
            return;
        }
        int studentID = Integer.parseInt(stu_id);
        Student st = new Student();
        st.setStu_id(studentID);
        st.setName(editName);
        st.setClass_id(Integer.parseInt(editClassID));
        if(studentContact.update(st)){
            JOptionPane.showMessageDialog(this, "更新成功!");
        }else{
            JOptionPane.showMessageDialog(this, "更新失败!");
        }
        studentContact.CloseCon();
        setTable(new Student());
    }

    private void searchActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 10:04
         * @description：给定条件进行查询
         */
        Student student = new Student();
        String str = (String) comboBox1.getSelectedItem();
        if("学生姓名".equals(str))
            student.setName(searchTextField.getText().toString());
        else if("全部".equals(str)){
            setTable(student);
        }
        else{
            String str2 =searchTextField.getText().toString();
            if(StringUtil.isEmpty(str2)){
                setTable(student);
                return;}
            student.setStu_id(Integer.parseInt(searchTextField.getText().toString()));
        }
        setTable(student);
    }

    private void DeletActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 10:04
         * @description：删除学生信息
         */
            if(JOptionPane.showConfirmDialog(this, "您确定删除么？") != JOptionPane.OK_OPTION){
                return;
            }
            int index = studentListTable.getSelectedRow();
            if(index == -1){
                JOptionPane.showMessageDialog(this, "请选中要删除的数据!");
                return;
            }
            int id = Integer.parseInt(stu_idTextField.getText().toString());
            StudentContact studentContact = new StudentContact();
            if(studentContact.delete(id)){
                JOptionPane.showMessageDialog(this, "删除成功!");
            }else{
                JOptionPane.showMessageDialog(this, "删除失败!");
            }
            studentContact.CloseCon();
            setTable(new Student());
        }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        comboBox1 = new JComboBox<>();
        searchTextField = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        studentListTable = new JTable();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        stu_idTextField = new JTextField();
        stu_nameTextField = new JTextField();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        classIDTextField4 = new JTextField();

        //======== this ========
        setTitle("\u5b66\u751f\u4fe1\u606f\u7ba1\u7406");
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setName("\u5b66\u751f\u59d3\u540d");

            //---- label1 ----
            label1.setText("\u67e5\u8be2\u65b9\u5f0f\uff1a");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 12f));

            //---- comboBox1 ----
            comboBox1.setFont(comboBox1.getFont().deriveFont(comboBox1.getFont().getSize() + 10f));
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u5168\u90e8",
                "\u5b66\u751f\u59d3\u540d",
                "\u5b66\u751f\u5b66\u53f7"
            }));

            //---- button1 ----
            button1.setText("\u67e5\u8be2");
            button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 10f));
            button1.setIcon(new ImageIcon(getClass().getResource("/image/ClassView/\u67e5\u8be2.png")));
            button1.addActionListener(e -> searchActionPerformed(e));

            //======== scrollPane1 ========
            {

                //---- studentListTable ----
                studentListTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null},
                    },
                    new String[] {
                        "\u73ed\u7ea7\u7f16\u53f7", "\u5b66\u751f\u5b66\u53f7", "\u5b66\u751f\u59d3\u540d"
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, true, true
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                });
                studentListTable.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        studentListTableMouseClicked(e);
                    }
                });
                scrollPane1.setViewportView(studentListTable);
            }

            //---- label2 ----
            label2.setText("\u73ed\u7ea7\u7f16\u53f7\uff1a");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));

            //---- label3 ----
            label3.setText("\u5b66\u751f\u5b66\u53f7\uff1a");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));

            //---- label4 ----
            label4.setText("\u5b66\u751f\u59d3\u540d\uff1a");
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 5f));

            //---- stu_idTextField ----
            stu_idTextField.setEditable(false);

            //---- button2 ----
            button2.setText("\u4fee\u6539");
            button2.addActionListener(e -> editActionPerformed(e));

            //---- button3 ----
            button3.setText("\u5220\u9664");
            button3.addActionListener(e -> DeletActionPerformed(e));

            //---- button4 ----
            button4.setText("\u91cd\u7f6e");
            button4.addActionListener(e -> resetActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchTextField, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 47, Short.MAX_VALUE))
                            .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(180, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(stu_nameTextField, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button2))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(stu_idTextField, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button3))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(classIDTextField4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(button4)))
                        .addGap(201, 201, 201))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(searchTextField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(button4)
                            .addComponent(classIDTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(stu_idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(stu_nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2))
                        .addGap(14, 14, 14))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JTextField searchTextField;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable studentListTable;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField stu_idTextField;
    private JTextField stu_nameTextField;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField classIDTextField4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
