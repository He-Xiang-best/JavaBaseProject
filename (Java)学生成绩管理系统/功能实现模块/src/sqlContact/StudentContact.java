package sqlContact;

import classType.infoType.Student;
import util.StringUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
 * @author:何翔
 * @date:2020/11/20 9:35
 * @description:学生类信息，与数据库打交道
 /*
 
 */

public class StudentContact extends BaseContact {
    /*
     * @author: 何翔
     * @param:
     * @return:
     * @date: 2020/11/20 9:35
     * @description：添加学生信息
     */
    public boolean addStudent(Student student){
        String sql = "insert into s_student values(?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setInt(1, student.getStu_id());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getClass_id());
            if(preparedStatement.executeUpdate() > 0)return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean isExistStudent(int classId,int stu_id,String name){
        /*
         * @author: 何翔
         * @param: [classId, stu_id, name]
         * @return: boolean
         * @date: 2020/11/20 9:35
         * @description：判断学生是否存在
         */
        String sql = "select * from s_student where s_id=? and classId=? and name=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, stu_id);
            preparedStatement.setInt(2, classId);
            preparedStatement.setString(3, name);
            ResultSet executeQuery = preparedStatement.executeQuery();
            if (executeQuery.next()){
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    public List<Student> getStudentList(Student student){
        /*
         * @author: 何翔
         * @param: [student]
         * @return: java.util.List<achieveModule.infoType.Student>
         * @date: 2020/11/20 9:36
         * @description：获取学生信息列表
         */
        List<Student> retList = new ArrayList<Student>();
        StringBuffer sqlString = new StringBuffer("select * from s_student");
        if(!StringUtil.isEmpty(student.getName())){
            sqlString.append(" and name like '%"+student.getName()+"%'");
        }
        if(student.getClass_id() != 0){
            sqlString.append(" and classId ="+student.getClass_id());
        }
        if(student.getStu_id() != 0){
            sqlString.append(" and s_id ="+student.getStu_id());
        }
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString.toString().replaceFirst("and", "where"));
            ResultSet executeQuery = preparedStatement.executeQuery();
            while(executeQuery.next()){
                Student s = new Student();
                s.setStu_id(executeQuery.getInt("s_id"));
                s.setName(executeQuery.getString("name"));
                s.setClass_id(executeQuery.getInt("classId"));
                retList.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retList;
    }
    public boolean delete(int id){
        /*
         * @author: 何翔
         * @param: [id]
         * @return: boolean
         * @date: 2020/11/20 9:36
         * @description：删除学生
         */
        String sql = "delete from s_student where s_id=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            if(preparedStatement.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean update(Student student){
        /*
         * @author: 何翔
         * @param: [student]
         * @return: boolean
         * @date: 2020/11/20 9:36
         * @description：更新学生信息
         */
        String sql = "update s_student set name=?, classId=? where s_id=?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getClass_id());
            preparedStatement.setInt(3, student.getStu_id());
            if(preparedStatement.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
