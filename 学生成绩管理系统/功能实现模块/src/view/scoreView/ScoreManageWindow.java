/*
 * Created by JFormDesigner on Wed Nov 18 16:05:29 CST 2020
 */

package view.scoreView;

import classType.infoType.Course;
import classType.infoType.Score;
import sqlContact.CourseContact;
import sqlContact.ScoreContact;
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
 * @date:2020/11/20 9:56
 * @description:课程管理窗口
 /*

 */

public class ScoreManageWindow extends JFrame {
    public void showScoreManageWindow(){
        this.setVisible(true);
    }
    public ScoreManageWindow() {
        initComponents();
        setCourseNameCombox();
        setTable(new Score(),0);
    }
    private void setTable(Score sc,int flag){
        /*
         * @author: 何翔
         * @param: [sc, flag]
         * @return: void
         * @date: 2020/11/20 9:56
         * @description：获取成绩信息填充表格
         */
        DefaultTableModel dft = (DefaultTableModel) scoreListTable.getModel();
        dft.setRowCount(0);
        ScoreContact scoreContact = new ScoreContact();
        List<Score> scoreList;
        if (flag==0){ scoreList = scoreContact.getScoreList(sc);}
        else scoreList = scoreContact.getScoreList2(sc, flag);
        for (Score score : scoreList) {
            Vector v = new Vector();
            v.add(score.getStu_id());
            v.add(score.getStu_name());
            v.add(score.getClass_id());
            v.add(score.getGrade());
            dft.addRow(v);
        }
        scoreContact.CloseCon();
    }

    private void searchbuttonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:57
         * @description：给定查询条件查询信息
         */
        Score sc = new Score();
        String course = String.valueOf(coursecomboBox.getSelectedItem());
        if (StringUtil.isEmpty(course)){
            JOptionPane.showMessageDialog(this, "当前没有课程成绩可供查询！");
            return;
        }
        if ("全部".equals(course)){
            allScoreActionPerformed(e);
            return;
        }
        sc.setCourse_name(course);
        setTable(sc,0);
    }
    private void setCourseNameCombox() {
        /*
         * @author: 何翔
         * @param: []
         * @return: void
         * @date: 2020/11/20 9:57
         * @description：提供可选已存在的课程
         */
        CourseContact courseContact = new CourseContact();
        List<Course> courseList = courseContact.getCourseList(new Course());
        coursecomboBox.addItem("全部");
        for (Course co : courseList) {
            coursecomboBox.addItem(co.getCourse_name());
        }
        courseContact.CloseCon();
    }

    private void allScoreActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:57
         * @description：全部信息展示
         */
        setTable(new Score(),0);
    }

    private void searchHighbuttonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:57
         * @description：查找最高分
         */
        String courseName = String.valueOf(coursecomboBox.getSelectedItem());
        Score sc = new Score();
        if (StringUtil.isEmpty(courseName)){
            JOptionPane.showMessageDialog(this, "当前没有课程成绩可供查询！");
            return;
        }
        sc.setCourse_name(courseName);
        setTable(sc,1);

    }

    private void searchLowbuttonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:58
         * @description：查找最低分
         */
        String courseName = String.valueOf(coursecomboBox.getSelectedItem());
        Score sc = new Score();
        if (StringUtil.isEmpty(courseName)){
            JOptionPane.showMessageDialog(this, "当前没有课程成绩可供查询！");
            return;
        }
        sc.setCourse_name(courseName);
        setTable(sc,2);
    }

    private void totalbuttonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:58
         * @description：总分排序
         */
        String courseName = String.valueOf(coursecomboBox.getSelectedItem());
        Score sc = new Score();
        if (StringUtil.isEmpty(courseName)){
            JOptionPane.showMessageDialog(this, "当前没有课程成绩可供查询！");
            return;
        }
        sc.setCourse_name(courseName);
        setTable(sc,3);
    }

    private void averagebuttonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:58
         * @description：平均分排序
         */
        String courseName = String.valueOf(coursecomboBox.getSelectedItem());
        Score sc = new Score();
        if (StringUtil.isEmpty(courseName)){
            JOptionPane.showMessageDialog(this, "当前没有课程成绩可供查询！");
            return;
        }
        sc.setCourse_name(courseName);
        setTable(sc,4);
    }

    private void scoreListTableMouseClicked(MouseEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 10:03
         * @description：通过点击事件填充文本栏
         */
        DefaultTableModel dft = (DefaultTableModel) scoreListTable.getModel();
        stuIDtextField.setText(dft.getValueAt(scoreListTable.getSelectedRow(), 0).toString());
        stuNametextField.setText(dft.getValueAt(scoreListTable.getSelectedRow(), 1).toString());
        if ("全部".equals(coursecomboBox.getSelectedItem().toString()))
        courseNametextField.setText("无");
        else
            courseNametextField.setText(coursecomboBox.getSelectedItem().toString());
        gradetextField.setText(dft.getValueAt(scoreListTable.getSelectedRow(), 3).toString());

    }

    private void editInfoActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 10:04
         * @description：编辑成绩信息
         */
        int index = scoreListTable.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(this, "请选中要修改的数据!");
            return;
        }
        DefaultTableModel dft = (DefaultTableModel) scoreListTable.getModel();
        String grade= dft.getValueAt(scoreListTable.getSelectedRow(), 3).toString();
        String editGrade = gradetextField.getText().toString();
        String classID = dft.getValueAt(scoreListTable.getSelectedRow(), 2).toString();
        String stu_id = stuIDtextField.getText().toString();
        String stu_name = stuNametextField.getText().toString();
        String course_name = courseNametextField.getText();
        if ("无".equals(course_name)){
            JOptionPane.showMessageDialog(this, "请选择要修改成绩科目!");
            return;
        }
        if(StringUtil.isEmpty(editGrade)){
            JOptionPane.showMessageDialog(this, "请填写要修改的内容!");
            return;
        }
        if(grade.equals(editGrade)){
            JOptionPane.showMessageDialog(this, "您还没有做任何修改!");
            return;
        }
        Score score = new Score();
        score.setStu_id(Integer.parseInt(stu_id));
        score.setStu_name(stu_name);
        score.setClass_id(Integer.parseInt(classID));
        score.setGrade(Float.parseFloat(editGrade));
        score.setCourse_name(course_name);
        ScoreContact scoreContact = new ScoreContact();
        if(scoreContact.update(score)){
            JOptionPane.showMessageDialog(this, "更新成功!");
        }else{
            JOptionPane.showMessageDialog(this, "更新失败!");
        }
        scoreContact.CloseCon();
        setTable(new Score(),0);

    }

    private void deletActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 10:04
         * @description：删除学生信息
         */
        int index = scoreListTable.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(this, "请选中要删除的数据!");
            return;
        }
        if(JOptionPane.showConfirmDialog(this, "您确定删除么？") != JOptionPane.OK_OPTION){
            return;
        }
        DefaultTableModel dft = (DefaultTableModel) scoreListTable.getModel();
        String grade= dft.getValueAt(scoreListTable.getSelectedRow(), 3).toString();
        String ClassID = dft.getValueAt(scoreListTable.getSelectedRow(), 2).toString();
        String stu_id = stuIDtextField.getText().toString();
        String stu_name = stuNametextField.getText().toString();
        String course_name = courseNametextField.getText();
        if ("无".equals(course_name)){
            JOptionPane.showMessageDialog(this, "请选择要修改成绩科目!");
            return;
        }
        Score score = new Score();
        score.setStu_id(Integer.parseInt(stu_id));
        score.setStu_name(stu_name);
        score.setClass_id(Integer.parseInt(ClassID));
        score.setGrade(Float.parseFloat(grade));
        score.setCourse_name(course_name);
        ScoreContact scoreContact = new ScoreContact();
        if(scoreContact.delete(score)){
            JOptionPane.showMessageDialog(this, "删除成功!");
        }else{
            JOptionPane.showMessageDialog(this, "删除失败!");
        }
        scoreContact.CloseCon();
        setTable(new Score(),0);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        scoreListTable = new JTable();
        coursecomboBox = new JComboBox();
        searchbutton = new JButton();
        allScore = new JButton();
        searchHighbutton = new JButton();
        searchLowbutton = new JButton();
        totalbutton = new JButton();
        averagebutton = new JButton();
        label1 = new JLabel();
        stuIDtextField = new JTextField();
        label2 = new JLabel();
        stuNametextField = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        gradetextField = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        courseNametextField = new JTextField();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {

            //======== scrollPane1 ========
            {

                //---- scoreListTable ----
                scoreListTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null},
                    },
                    new String[] {
                        "\u5b66\u53f7", "\u59d3\u540d", "\u73ed\u7ea7", "\u6210\u7ee9"
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                });
                scoreListTable.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        scoreListTableMouseClicked(e);
                    }
                });
                scrollPane1.setViewportView(scoreListTable);
            }

            //---- searchbutton ----
            searchbutton.setText("\u67e5\u8be2");
            searchbutton.addActionListener(e -> searchbuttonActionPerformed(e));

            //---- allScore ----
            allScore.setText("\u6210\u7ee9\u6e05\u5355");
            allScore.addActionListener(e -> allScoreActionPerformed(e));

            //---- searchHighbutton ----
            searchHighbutton.setText("\u6700\u9ad8\u5206\u67e5\u8be2");
            searchHighbutton.addActionListener(e -> searchHighbuttonActionPerformed(e));

            //---- searchLowbutton ----
            searchLowbutton.setText("\u6700\u4f4e\u5206\u67e5\u8be2");
            searchLowbutton.addActionListener(e -> searchLowbuttonActionPerformed(e));

            //---- totalbutton ----
            totalbutton.setText("\u603b\u6210\u7ee9\u6392\u5e8f");
            totalbutton.addActionListener(e -> totalbuttonActionPerformed(e));

            //---- averagebutton ----
            averagebutton.setText("\u5e73\u5747\u5206\u6392\u5e8f");
            averagebutton.addActionListener(e -> averagebuttonActionPerformed(e));

            //---- label1 ----
            label1.setText("\u5b66\u53f7:");

            //---- stuIDtextField ----
            stuIDtextField.setEditable(false);

            //---- label2 ----
            label2.setText("\u59d3\u540d\uff1a");

            //---- stuNametextField ----
            stuNametextField.setEditable(false);

            //---- label3 ----
            label3.setText("\u79d1\u76ee\uff1a");

            //---- label4 ----
            label4.setText("\u6210\u7ee9\uff1a");

            //---- button1 ----
            button1.setText("\u4fee\u6539\u6210\u7ee9");
            button1.addActionListener(e -> editInfoActionPerformed(e));

            //---- button2 ----
            button2.setText("\u5220\u9664\u6210\u7ee9");
            button2.addActionListener(e -> deletActionPerformed(e));

            //---- courseNametextField ----
            courseNametextField.setEditable(false);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(coursecomboBox, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(searchbutton)
                                .addGap(68, 68, 68)
                                .addComponent(allScore))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(searchHighbutton)
                                        .addGap(78, 78, 78)
                                        .addComponent(searchLowbutton)
                                        .addGap(77, 77, 77)
                                        .addComponent(totalbutton))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                .addComponent(label2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(label1)
                                                .addGap(15, 15, 15)))
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(stuIDtextField, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                            .addComponent(stuNametextField, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                        .addGap(96, 96, 96)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label3)
                                            .addComponent(label4))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(gradetextField, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                            .addComponent(courseNametextField, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))))
                                .addGap(79, 79, 79)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(button1)
                                    .addComponent(averagebutton)
                                    .addComponent(button2))))
                        .addContainerGap(21, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(allScore)
                            .addComponent(searchbutton)
                            .addComponent(coursecomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(stuIDtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3)
                            .addComponent(button1)
                            .addComponent(courseNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(stuNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4)
                            .addComponent(gradetextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(searchHighbutton)
                            .addComponent(averagebutton)
                            .addComponent(totalbutton)
                            .addComponent(searchLowbutton))
                        .addGap(29, 29, 29))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable scoreListTable;
    private JComboBox coursecomboBox;
    private JButton searchbutton;
    private JButton allScore;
    private JButton searchHighbutton;
    private JButton searchLowbutton;
    private JButton totalbutton;
    private JButton averagebutton;
    private JLabel label1;
    private JTextField stuIDtextField;
    private JLabel label2;
    private JTextField stuNametextField;
    private JLabel label3;
    private JLabel label4;
    private JTextField gradetextField;
    private JButton button1;
    private JButton button2;
    private JTextField courseNametextField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
